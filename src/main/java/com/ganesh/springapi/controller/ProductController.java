package com.ganesh.springapi.controller;

import com.ganesh.springapi.models.Product;
import com.ganesh.springapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;


@RequestMapping("/products")
@RestController
public class ProductController<ResponceEntity> {
    // This class will handle product-related requests
    // You can add methods here to handle CRUD operations for products
    // For example, you can add methods to create, read, update, and delete products

    // Example method to get all products
    // @GetMapping("/all")
    // public List<Product> getAllProducts() {
    //     // Logic to retrieve all products
    // }
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        // Constructor injection for ProductService
        this.productService = productService;
    }

    @GetMapping("/test")
    public  String tesProduct() {
        return "Product class is working fine";
    }


    @GetMapping("/{id}")
    private Product getProductById( @PathVariable("id") Long id) {
        // Logic to retrieve a product by its ID
        return productService.getProduct(Math.toIntExact(id)); // Placeholder return statement
    }

    @GetMapping()
    private ResponseEntity<List<Product>> getAllProducts() {
        // Logic to retrieve all products
        List<Product> products = productService.getProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/create")
    private Product createProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        Product p = new Product();
        // Logic to create a new product
        return new Product(); // Placeholder return statement
    }

    @PatchMapping("/update/{id}")
    private Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        // Logic to update an existing product by its ID
        return product; // Placeholder return statement
    }

    @PutMapping("/replace/{id}")
    private Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        // Logic to replace an existing product by its ID
        return product; // Placeholder return statement
    }

    @DeleteMapping("/delete/{id}")
    private String deleteProduct(@PathVariable("id") Long id) {
        // Logic to delete a product by its ID
        return "Product with ID " + id + " deleted successfully"; // Placeholder return statement
    }



    // complete this API

}
