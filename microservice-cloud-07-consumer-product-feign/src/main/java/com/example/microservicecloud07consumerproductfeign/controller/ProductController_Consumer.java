package com.example.microservicecloud07consumerproductfeign.controller;

import com.example.microservicecloud07consumerproductfeign.service.ProductClientService;
import com.mengxuegu.springcloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductController_Consumer {

    private static final String REST_URL_PREFIX = "http://microservice-product";

    @Autowired
    private ProductClientService productClientService;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return productClientService.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productClientService.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return productClientService.list();
    }



}
