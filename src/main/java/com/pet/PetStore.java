package com.pet;

import java.util.List;
import java.util.Objects;


/**
 * This class' purpose is to be the PetStore Javabean
 */
public class PetStore{
	private List<String> photoUrls;
	private String name;
	private int id;
	private Category category;
	private List<TagsItem> tags;
	private String status;

	/**
	 * Set photo urls.
	 *
	 * @param photoUrls the photo urls
	 */
	public void setPhotoUrls(List<String> photoUrls){
		this.photoUrls = photoUrls;
	}

	/**
	 * Get photo urls list.
	 *
	 * @return the list
	 */
	public List<String> getPhotoUrls(){
		return photoUrls;
	}

	/**
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set id.
	 *
	 * @param id the id
	 */
	public void setId(int id){
		this.id = id;
	}

	/**
	 * Get id int.
	 *
	 * @return the int
	 */
	public int getId(){
		return id;
	}

	/**
	 * Set category.
	 *
	 * @param category the category
	 */
	public void setCategory(Category category){
		this.category = category;
	}

	/**
	 * Get category category.
	 *
	 * @return the category
	 */
	public Category getCategory(){
		return category;
	}

	/**
	 * Set tags.
	 *
	 * @param tags the tags
	 */
	public void setTags(List<TagsItem> tags){
		this.tags = tags;
	}

	/**
	 * Get tags list.
	 *
	 * @return the list
	 */
	public List<TagsItem> getTags(){
		return tags;
	}

	/**
	 * Set status.
	 *
	 * @param status the status
	 */
	public void setStatus(String status){
		this.status = status;
	}

	/**
	 * Get status string.
	 *
	 * @return the string
	 */
	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"PetStore{" + 
			"photoUrls = '" + photoUrls + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",category = '" + category + '\'' + 
			",tags = '" + tags + '\'' + 
			",status = '" + status + '\'' + 
			"}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PetStore petStore = (PetStore) o;
		return id == petStore.id && Objects.equals(photoUrls, petStore.photoUrls) && Objects.equals(name, petStore.name) && Objects.equals(category, petStore.category) && Objects.equals(status, petStore.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(photoUrls, name, id, category, status);
	}
}