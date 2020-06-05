package com.mengxuegu.springcloud.service.impl;

import com.mengxuegu.springcloud.entity.Product;
import com.mengxuegu.springcloud.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        Product product = new Product();
        product.setPid(101L);
        product.setProductName("feign集成客户端熔断器");
        return product;
    }

    @Override
    public List<Product> list() {
        List<Product> productArrayList = new ArrayList<Product>();
        Product product = new Product();
        product.setPid(100L);
        product.setProductName("查询失败，feign集成客户端熔断器");
        productArrayList.add(product);
        return productArrayList;
    }
}
