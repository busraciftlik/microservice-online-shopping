package com.busraciftlik.catalogservice.business.rules;

import com.busraciftlik.catalogservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductBusinessRules {
    private final ProductRepository repository;
}
