package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Products;

public interface ProductService {


	public Products AddProducts(Products products);
	public List<Products> FindProducts();
	public Products FindProductsById(int id);
	public void DeleteProductsById(int id);

	public Products UpdateProducts(int id, Products products);
}
