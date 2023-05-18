package com.busraciftlik.catalogservice.business.abstracts;

import com.busraciftlik.catalogservice.business.dto.requests.create.CreateCategoryRequest;
import com.busraciftlik.catalogservice.business.dto.requests.update.UpdateCategoryRequest;
import com.busraciftlik.catalogservice.business.dto.responses.create.CreateCategoryResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetAllCategoriesResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetCategoryResponse;
import com.busraciftlik.catalogservice.business.dto.responses.update.UpdateCategoryResponse;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<GetAllCategoriesResponse> getAll();

    GetCategoryResponse getById(UUID id);

    CreateCategoryResponse add(CreateCategoryRequest createCategoryRequest);

    UpdateCategoryResponse update(UUID id, UpdateCategoryRequest updateCategoryRequest);

    void delete(UUID id);
}
