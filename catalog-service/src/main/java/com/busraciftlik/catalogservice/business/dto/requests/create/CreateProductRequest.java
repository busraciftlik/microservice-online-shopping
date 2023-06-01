package com.busraciftlik.catalogservice.business.dto.requests.create;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    private List<Integer> categoryIds;

    @Size(min = 1 , max = 20)
    @NotBlank
    @NotNull
    private String name;
    private int stock;

    @Min(value = 1)
    private double price;

    @Size(max = 35)
    private String description;
}
