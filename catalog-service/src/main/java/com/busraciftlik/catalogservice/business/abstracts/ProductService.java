package com.busraciftlik.catalogservice.business.abstracts;

import com.busraciftlik.catalogservice.business.dto.requests.create.CreateProductRequest;
import com.busraciftlik.catalogservice.business.dto.requests.update.UpdateProductRequest;
import com.busraciftlik.catalogservice.business.dto.responses.create.CreateProductResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetAllProductsResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetProductResponse;
import com.busraciftlik.catalogservice.business.dto.responses.update.UpdateProductResponse;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<GetAllProductsResponse> getAll();

    GetProductResponse getById(UUID id);

    CreateProductResponse add(CreateProductRequest createProductRequest);

    UpdateProductResponse update(UUID id, UpdateProductRequest updateProductRequest);

    void delete(UUID id);

}