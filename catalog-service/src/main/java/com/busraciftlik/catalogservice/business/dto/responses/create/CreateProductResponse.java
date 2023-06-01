package com.busraciftlik.catalogservice.business.dto.responses.create;

import com.busraciftlik.catalogservice.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductResponse {
    private UUID id;
    private String name;
    private int stock;
    private double price;
    private String description;
    private List<Category> categories;

}
