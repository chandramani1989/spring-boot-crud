package com.chandra.springbootcrud.service;

import java.util.List;

import com.chandra.springbootcrud.entity.Product;
import com.chandra.springbootcrud.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
           return productRepository.save(product);
    }

     public List<Product> saveProduct(List<Product> productList){
           return productRepository.saveAll(productList);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product findById(int id){
        return productRepository.findById(id).orElse(null);
    }

    public Product findByName(String name){
        return productRepository.findByName(name).orElse(null);
    }

    public String deleteProduct(int id){
        productRepository.deleteById(id);
        return "product remove !"+id;
    }

	public Product updateProduct(Product product) {

        Product existingproduct = productRepository.findById(product.getId()).orElse(null);
        existingproduct.setName(product.getName());
        existingproduct.setQuantity(product.getQuantity());
        existingproduct.setPrice(product.getPrice());
		return productRepository.save(existingproduct);
	}
}