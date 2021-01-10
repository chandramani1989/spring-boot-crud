package com.chandra.springbootcrud.controller;

import java.util.List;

import com.chandra.springbootcrud.entity.Product;
import com.chandra.springbootcrud.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> products) {
        return productService.saveProduct(products);
    }

    @GetMapping("/products")
    public List<Product> getProduct() {
        return productService.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.findById(id);
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable String name) {
        return productService.findByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
    
}