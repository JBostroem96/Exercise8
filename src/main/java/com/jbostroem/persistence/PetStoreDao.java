package com.jbostroem.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pet.PetStore;
import com.jbostroem.testUtils.PropertiesLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Properties;

/**
 * This class' purpose is to get the data via the url and return it
 */
public class PetStoreDao implements PropertiesLoader {
    Properties properties;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiates a new Pet store dao along with the properties.
     */
    public PetStoreDao() {

        properties = loadProperties("/database.properties");
    }

    /**
     * Gets pet by id.
     *
     * @param id the id
     * @return the pet by id
     */
    PetStore getPetById(int id) {

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(properties.getProperty("url") + id);
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        PetStore petStore = null;

        try {
            petStore = mapper.readValue(response, PetStore.class);
        } catch (JsonProcessingException e) {

            logger.error("There was an issue processing this", e);
        }
        return petStore;
    }
}

