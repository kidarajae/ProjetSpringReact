package com.example.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.admin.model.admin;

@Repository
public interface adminRepository extends JpaRepository<admin,Integer>{

}
