package com.example.restapiproduct.controller;

import com.example.restapiproduct.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @GetMapping("/products")
    public List<Product> getProduct(){
        List<Product> pr = new ArrayList<>();

        pr.add(new Product(1, "Wireless Mouse", "Ergonomic wireless mouse with adjustable DPI and long battery life.", 29.99));
        pr.add(new Product(2, "Bluetooth Speaker", "Portable Bluetooth speaker with deep bass and 360-degree sound for indoor and outdoor use.", 49.99));
        pr.add(new Product(3, "Fitness Tracker", "Smart fitness tracker with heart rate monitor, step counter, and sleep tracker for better health management.", 79.99));

        return pr;
    }
}
