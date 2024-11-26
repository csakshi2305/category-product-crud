package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Products;

import com.example.demo.Repository.ProductRepo;
import com.example.demo.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Products AddProducts(Products products) {
		return productRepo.save(products);
	}

	@Override
	public List<Products> FindProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public Products FindProductsById(int id) {
		Products pro= productRepo.findById(id).get();
		return pro;
	}

	@Override
	public void DeleteProductsById(int id) {
		productRepo.deleteById(id);
		
	}

	@Override
	public  Products UpdateProducts(int id, Products productsDetails) {
		Products products = productRepo.findById(id).get();

		products.setPname(productsDetails.getPname());
		products.setCname(productsDetails.getCname());
		       

		        return productRepo.save(products);
	}


}

