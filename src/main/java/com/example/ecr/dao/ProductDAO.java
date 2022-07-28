package com.example.ecr.dao;

import com.example.ecr.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Product is for the name of the POJO class, and Integer is for the data type of the primary key in that class
public interface ProductDAO extends JpaRepository<Product, Integer> {
}
