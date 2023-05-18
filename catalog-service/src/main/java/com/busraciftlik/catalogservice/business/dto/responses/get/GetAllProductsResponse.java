package com.busraciftlik.catalogservice.business.dto.responses.get;

import com.busraciftlik.catalogservice.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductsResponse {
    private UUID id;
    private String name;
    private int stock;
    private double price;
    private String description;
    private Set<UUID> categoryIds = new HashSet<>();
    private List<Category> categories;

}
