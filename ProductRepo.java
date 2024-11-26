package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Products;

public interface ProductRepo extends JpaRepository<Products, Integer>{

}
