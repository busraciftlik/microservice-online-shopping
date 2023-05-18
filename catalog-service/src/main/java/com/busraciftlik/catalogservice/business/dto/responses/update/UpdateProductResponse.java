package com.busraciftlik.catalogservice.business.dto.responses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductResponse {
    private UUID id;
    private Set<Integer> categoryIds;
    private String name;
    private double price;
    private int stock;
    private String description;
}
