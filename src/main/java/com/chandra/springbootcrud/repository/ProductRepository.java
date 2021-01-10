package com.chandra.springbootcrud.repository;

import java.util.Optional;

import com.chandra.springbootcrud.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	Optional<Product> findByName(String name);
    
}