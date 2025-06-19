package com.ganesh.springapi.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDTO {
    private int id;
    private String title;
    private String description;
    private double price;
    private String category;
    private String imageUrl;
}
