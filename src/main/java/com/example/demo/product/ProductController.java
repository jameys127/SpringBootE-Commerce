package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/product")
public class ProductController {

    private final ProductService productServ;

    @Autowired
    public ProductController(ProductService productService) {
        this.productServ = productService;
    }

    @GetMapping
    public String getProduct(){
        return productServ.getProduct();
    }
}
