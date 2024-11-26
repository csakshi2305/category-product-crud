package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Category;
import com.example.demo.Repository.CategoryRepo;
import com.example.demo.Service.CategoryService;



@Service
public class CategoryServiceImpl implements CategoryService{


	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public Category AddCategory(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public List<Category> FindCategory() {
		
		return categoryRepo.findAll();
	}

	@Override
	public Category FindCategoryById(int id) {
		Category cat= categoryRepo.findById(id).get();
		return cat;
	}

	@Override
	public void DeleteCategoryById(int id) {
		categoryRepo.deleteById(id);
		
	}

	@Override
	public  Category UpdateCategory(int id, Category categoryDetails) {
		Category category = categoryRepo.findById(id).get();

		category.setName(categoryDetails.getName());
		        category.setDescription(categoryDetails.getDescription());
		       

		        return categoryRepo.save(category);
	}


}

