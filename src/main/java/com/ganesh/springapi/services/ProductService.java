package com.ganesh.springapi.services;

import com.ganesh.springapi.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public Product getProduct(int id);
    public List<Product> getProducts();

    public Product postProduct(Long id,Product product);
}





//Complete this API
