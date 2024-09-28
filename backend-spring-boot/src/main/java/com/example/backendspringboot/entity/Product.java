package com.example.backendspringboot.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private String image;
    private Integer evaluate;
    private Integer price;
    private Integer cost;

    @OneToOne()
    @JoinColumn(name = "product_info_id")
    private ProductInfo productInfo;
}
