package com.ganesh.springapi.services;

import com.ganesh.springapi.DTO.ProductDTO;
import com.ganesh.springapi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;

    @Autowired
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Product convertDTOToProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setTitle(productDTO.getTitle());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(productDTO.getCategory());
        product.setImage(productDTO.getImageUrl());
        return product;
    }



    @Override
    public Product getProduct(int id) {


        ProductDTO productDTO =  restTemplate.getForObject("https://fakestoreapi.com/products/" + id, ProductDTO.class);
        // Default implementation can be provided here if needed
        return convertDTOToProduct(productDTO);
    }
    @Override
    public List<Product> getProducts() {
        // Logic to retrieve all products
        ProductDTO[] productDTOs = restTemplate.getForObject("https://fakestoreapi.com/products", ProductDTO[].class);
        List<Product> answer = new ArrayList<>();
        for(ProductDTO productDTO : productDTOs) {
            answer.add(convertDTOToProduct(productDTO));
        }
        return answer;
    }
    @Override
    public Product postProduct(Long id, Product product) {
//        restTemplate.postForObject("https://fakestoreapi.com/products", product, Product.class);
        // Logic to create a new product
        // This method can be implemented if needed
        return null; // Placeholder return statement


//        RequestCallback requestCallback = restTemplate.httpEntityCallback(new ProductDTO(), ProductDTO.class);
//        HttpMessageConverterExtractor<ProductDTO> responseExtractor = new HttpMessageConverterExtractor(ProductDTO.class, restTemplate.getMessageConverters());
//        ProductDTO reponce = return restTemplate.execute("https://fakestoreapi.com/products/" + id , HttpMethod.PUT, requestCallback, responseExtractor, new Object(){});
    }
}
