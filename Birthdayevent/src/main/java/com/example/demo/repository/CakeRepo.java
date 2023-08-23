package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CakeEntity;

public interface CakeRepo extends JpaRepository<CakeEntity, Integer>{

}
