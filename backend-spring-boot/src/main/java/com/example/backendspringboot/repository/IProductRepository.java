package com.example.backendspringboot.repository;

import com.example.backendspringboot.dto.ProductDto;
import com.example.backendspringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select p.product_id, p.name, p.image, p.evaluate, p.price, p.cost " +
            "from product p", nativeQuery = true)
    List<ProductDto> getAllProduct();

    @Query(value = "select p.product_id, p.name, p.image, p.evaluate, p.price, p.cost, p.product_info_id, pi.info_id, " +
            "pi.description, pi.expire_date, pi.quantity " +
            "from product p " +
            "inner join product_info pi on p.product_info_id = pi.info_id " +
            "where p.product_id = :id", nativeQuery = true)
    Product findByIdProductDetail(@Param("id") Long id);
}
