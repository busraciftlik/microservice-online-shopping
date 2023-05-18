package com.busraciftlik.catalogservice.business.dto.requests.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    private Set<Integer> categoryIds;
    private String name;
    private double price;
    private int stock;
    private String description;
}
