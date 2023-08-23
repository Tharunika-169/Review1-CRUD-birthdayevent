package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PackagesEntity;

public interface PackagesRepo extends JpaRepository<PackagesEntity, Integer> {

}
