package com.example.microservicecloud06providerproduct8002.controller;

import com.example.microservicecloud06providerproduct8002.service.ProductService;
import com.mengxuegu.springcloud.entity.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
//        throw new RuntimeException("模拟报错");
        return productService.get(id);
    }
    public Product hystrixGet(@PathVariable("id") Long id) {
        Product product = new Product();
        product.setPid(101L);
        product.setProductName("服务端熔断");
        return product;
    }

    @HystrixCommand(fallbackMethod = "hystrixList")
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
//        throw new RuntimeException("模拟报错");
        return productService.list();
    }

    public List<Product> hystrixList() {
        List<Product> productArrayList = new ArrayList<Product>();
        Product product = new Product();
        product.setPid(100L);
        product.setProductName("查询失败，服务端熔断");
        productArrayList.add(product);
        return productArrayList;
    }


}
