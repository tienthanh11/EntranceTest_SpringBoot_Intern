package com.example.backendspringboot.controller;

import com.example.backendspringboot.dto.ProductDto;
import com.example.backendspringboot.entity.Product;
import com.example.backendspringboot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("")
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        List<ProductDto> products = productService.findAllProduct();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    private ResponseEntity<Product> findByIdProductDetail(@PathVariable Long id) {
        Product product = productService.findByIdProductDetail(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
