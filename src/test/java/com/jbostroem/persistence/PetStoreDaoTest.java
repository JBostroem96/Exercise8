package com.jbostroem.persistence;

import com.pet.PetStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class' purpose is to test the PetStore class
 *
 */
class PetStoreDaoTest {

    /**
     * Gets pet name by id success.
     */
    @Test
    void getPetNameByIdSuccess() {

        /*
        PetStoreDao dao = new PetStoreDao();
        PetStore retrievedPet = dao.getPetById(2);
        assertNotNull(retrievedPet);
        assertEquals(retrievedPet, dao.getPetById(2));
         */
        PetStoreDao dao = new PetStoreDao();
        String retrievedPetName = dao.getPetById(2).getName();
        assertNotNull(retrievedPetName);
        assertEquals(retrievedPetName, dao.getPetById(2).getName());
    }
}