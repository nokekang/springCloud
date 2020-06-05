package com.mengxuegu.springcloud.controller;

import com.mengxuegu.springcloud.entity.Product;
import com.mengxuegu.springcloud.service.ProductService;
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
@RequestMapping(value = "/feign")
public class ProductControllerFeignConsumer {


    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add")
    public boolean add(Product product) {
        boolean add = productService.add(product);
        return add;
    }

    @RequestMapping(value = "/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);
        return product;
    }

    @RequestMapping(value = "/product/list")
    public List<Product> list() {
        List<Product> list = productService.list();
        return list;
    }



}
