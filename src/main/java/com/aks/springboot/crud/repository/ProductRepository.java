package com.aks.springboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aks.springboot.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
