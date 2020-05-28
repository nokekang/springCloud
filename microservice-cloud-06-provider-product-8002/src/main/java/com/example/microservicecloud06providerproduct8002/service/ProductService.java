package com.example.microservicecloud06providerproduct8002.service;



import com.mengxuegu.springcloud.entity.Product;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();

}
