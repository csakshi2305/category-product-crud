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
import com.example.demo.Entity.Products;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("products")
	public Products addProducts(@RequestBody Products products) {
		return productService.AddProducts(products);
		
	}
	
	@GetMapping("products")
	public List<Products> findProducts(){
		return productService.FindProducts();
	}
	
	
	@GetMapping("products/{id}")
	public Products findProductsBYId(@PathVariable("id") int id) {
		return productService.FindProductsById(id);
	}

	
	@PutMapping("products/{id}")
	public Products updateProducts(@PathVariable("id")int id,@RequestBody Products products) {
		return productService.UpdateProducts(id,products);
	}

	
	@DeleteMapping("products/{id}")
	public void deleteProducts(@PathVariable("id")int id) {
		 productService.DeleteProductsById(id);
	}
}

