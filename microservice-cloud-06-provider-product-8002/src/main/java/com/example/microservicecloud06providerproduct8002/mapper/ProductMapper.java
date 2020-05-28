package com.example.microservicecloud06providerproduct8002.mapper;

import com.mengxuegu.springcloud.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
