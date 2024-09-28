package com.example.backendspringboot.service;

import com.example.backendspringboot.dto.ProductDto;
import com.example.backendspringboot.entity.Product;

import java.util.List;

public interface IProductService {
    List<ProductDto> findAllProduct();

    Product findByIdProductDetail(Long id);
}
