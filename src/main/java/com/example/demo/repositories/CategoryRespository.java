package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long> {

}
