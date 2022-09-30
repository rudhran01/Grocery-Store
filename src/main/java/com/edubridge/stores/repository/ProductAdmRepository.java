package com.edubridge.stores.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.stores.entity.Product;

public interface ProductAdmRepository extends JpaRepository<Product, Long> {
}
