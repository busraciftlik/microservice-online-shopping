package com.busraciftlik.catalogservice.api.controllers;

import com.busraciftlik.catalogservice.business.abstracts.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductsController {
    private final ProductService service;
}
