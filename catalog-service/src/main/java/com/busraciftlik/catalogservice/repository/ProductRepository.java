package com.busraciftlik.catalogservice.repository;

import com.busraciftlik.catalogservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
