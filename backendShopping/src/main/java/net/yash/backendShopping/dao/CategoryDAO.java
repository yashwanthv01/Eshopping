package net.yash.backendShopping.dao;

import java.util.List;

import net.yash.backendShopping.dto.Category;

public interface CategoryDAO {

	List<Category> list(); // returns the list of categories which are present.
	
	Category get(int id); // get the prodcuts by the category id.
}
