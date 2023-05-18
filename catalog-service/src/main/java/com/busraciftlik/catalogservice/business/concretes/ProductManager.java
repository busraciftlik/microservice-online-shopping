package com.busraciftlik.catalogservice.business.concretes;

import com.busraciftlik.catalogservice.business.abstracts.ProductService;
import com.busraciftlik.catalogservice.business.dto.requests.create.CreateProductRequest;
import com.busraciftlik.catalogservice.business.dto.requests.update.UpdateProductRequest;
import com.busraciftlik.catalogservice.business.dto.responses.create.CreateProductResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetAllProductsResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetProductResponse;
import com.busraciftlik.catalogservice.business.dto.responses.update.UpdateProductResponse;
import com.busraciftlik.catalogservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper mapper;
    @Override
    public List<GetAllProductsResponse> getAll() {
        return null;
    }

    @Override
    public GetProductResponse getById(UUID id) {
        return null;
    }

    @Override
    public CreateProductResponse add(CreateProductRequest createProductRequest) {
        return null;
    }

    @Override
    public UpdateProductResponse update(UUID id, UpdateProductRequest updateProductRequest) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
