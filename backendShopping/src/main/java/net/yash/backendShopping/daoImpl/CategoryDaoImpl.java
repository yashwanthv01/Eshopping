package net.yash.backendShopping.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.yash.backendShopping.dao.CategoryDAO;
import net.yash.backendShopping.dto.Category;

@Repository(value="CategoryDAO")
public class CategoryDaoImpl implements CategoryDAO {
	
	public CategoryDaoImpl() {
		/* Instanciating temporary data base for testing .. */
		Category cr1 = new Category(1,"Television","little info regarding Television","CR_1.png");
		Category cr2 = new Category(2,"Mobile","little info regarding Mobile","CR_2.png");
		Category cr3 = new Category(3,"Laptop","little info regarding Laptop","CR_3.png");
		categories.add(cr1);
		categories.add(cr2);
		categories.add(cr3);
	}

	private List<Category> categories = new ArrayList<>();

	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories){
			if(category.getId() == id)
				return category;
		}
			
		return null;
	}

}
