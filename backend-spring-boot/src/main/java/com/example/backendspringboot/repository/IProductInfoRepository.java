package com.example.backendspringboot.repository;

import com.example.backendspringboot.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductInfoRepository extends JpaRepository<ProductInfo, Long> {
}
