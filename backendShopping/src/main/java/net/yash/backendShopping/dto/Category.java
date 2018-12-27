package net.yash.backendShopping.dto;

public class Category {

	public Category(){
		// Default constructor do nothing 
	}
	// with active status
	public Category(int id, String name, String description, String imageURL, boolean active) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageURL = imageURL;
		this.active = active;
	}

	// without active status
	public Category(int id, String name, String description, String imageURL) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageURL = imageURL;
	}


	/* dto is commnly may be called as model
	 * Dto -> data trasfer object  */
	
	private int id;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	 /* Private variables ..
	  *  declared.*/
	private String name;
	private String description;
	private String imageURL;
	private boolean active = true;
	
}
