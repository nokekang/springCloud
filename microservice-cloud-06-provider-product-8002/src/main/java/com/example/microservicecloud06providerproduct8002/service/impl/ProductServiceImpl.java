package com.example.microservicecloud06providerproduct8002.service.impl;

import com.example.microservicecloud06providerproduct8002.mapper.ProductMapper;
import com.example.microservicecloud06providerproduct8002.service.ProductService;
import com.mengxuegu.springcloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
@Service //一定不要少了
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public boolean add(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product get(Long id) {
        return productMapper.findById(id);
    }

    @Override
    public List<Product> list() {
        return productMapper.findAll();
    }

}
