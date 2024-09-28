package com.example.backendspringboot.service.impl;

import com.example.backendspringboot.repository.IProductInfoRepository;
import com.example.backendspringboot.service.IProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoService implements IProductInfoService {

    @Autowired
    private IProductInfoRepository productInfoRepository;
}
