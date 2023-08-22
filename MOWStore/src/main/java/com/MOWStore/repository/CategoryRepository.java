package com.MOWStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MOWStore.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{

}
