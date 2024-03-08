package com.pet;

/**
 * This class' purpose is to be the Category Javabean
 */
public class Category{
	private String name;
	private int id;

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

	@Override
 	public String toString(){
		return 
			"Category{" + 
			"name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
