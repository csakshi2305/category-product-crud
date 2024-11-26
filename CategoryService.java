package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Category;



public interface CategoryService {

	public Category AddCategory(Category category);
	public List<Category> FindCategory();
	public Category FindCategoryById(int id);
	public void DeleteCategoryById(int id);

	public Category UpdateCategory(int id, Category category);
}
