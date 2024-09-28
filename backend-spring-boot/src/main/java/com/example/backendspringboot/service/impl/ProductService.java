package com.example.backendspringboot.service.impl;

import com.example.backendspringboot.dto.ProductDto;
import com.example.backendspringboot.entity.Product;
import com.example.backendspringboot.repository.IProductRepository;
import com.example.backendspringboot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<ProductDto> findAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public Product findByIdProductDetail(Long id) {
        return productRepository.findByIdProductDetail(id);
    }
}
