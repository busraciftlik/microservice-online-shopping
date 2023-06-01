package com.busraciftlik.catalogservice.business.rules;

import com.busraciftlik.catalogservice.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryBusinessRules {
    private final CategoryRepository categoryRepository;
}
