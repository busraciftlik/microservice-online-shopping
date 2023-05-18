package com.busraciftlik.catalogservice.business.concretes;

import com.busraciftlik.catalogservice.business.abstracts.CategoryService;
import com.busraciftlik.catalogservice.business.dto.requests.create.CreateCategoryRequest;
import com.busraciftlik.catalogservice.business.dto.requests.update.UpdateCategoryRequest;
import com.busraciftlik.catalogservice.business.dto.responses.create.CreateCategoryResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetAllCategoriesResponse;
import com.busraciftlik.catalogservice.business.dto.responses.get.GetCategoryResponse;
import com.busraciftlik.catalogservice.business.dto.responses.update.UpdateCategoryResponse;
import com.busraciftlik.catalogservice.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper mapper;
    @Override
    public List<GetAllCategoriesResponse> getAll() {
        return null;
    }

    @Override
    public GetCategoryResponse getById(UUID id) {
        return null;
    }

    @Override
    public CreateCategoryResponse add(CreateCategoryRequest createCategoryRequest) {
        return null;
    }

    @Override
    public UpdateCategoryResponse update(UUID id, UpdateCategoryRequest updateCategoryRequest) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }
}
