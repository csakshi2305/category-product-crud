package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Category;
import com.example.demo.Service.CategoryService;


@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping("categories")
	public Category addStudent(@RequestBody Category category) {
		return categoryService.AddCategory(category);
		
	}
	
	@GetMapping("categories")
	public List<Category> findCategory(){
		return categoryService.FindCategory();
	}
	
	
	@GetMapping("categories/{id}")
	public Category findCategoryBYId(@PathVariable("id") int id) {
		return categoryService.FindCategoryById(id);
	}

	
	@PutMapping("categories/{id}")
	public Category updateCategory(@PathVariable("id")int id,@RequestBody Category category) {
		return categoryService.UpdateCategory(id,category);
	}

	
	@DeleteMapping("categories/{id}")
	public void deleteCategory(@PathVariable("id")int id) {
		 categoryService.DeleteCategoryById(id);
	}
}
