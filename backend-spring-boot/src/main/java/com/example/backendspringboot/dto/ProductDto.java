package com.example.backendspringboot.dto;

public interface ProductDto {
    Long getProduct_Id();
    String getName();
    String getImage();
    Integer getEvaluate();
    Integer getPrice();
    Integer getCost();
}
