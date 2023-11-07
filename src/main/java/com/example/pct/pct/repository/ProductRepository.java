package com.example.pct.pct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pct.pct.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{

}
