package com.example.okey.controller;

import com.example.okey.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CartController {
    @Autowired
    private ProductService productService;


}
