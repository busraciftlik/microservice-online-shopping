package com.busraciftlik.catalogservice.repository;

import com.busraciftlik.catalogservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
