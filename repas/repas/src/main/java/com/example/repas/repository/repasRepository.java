package com.example.repas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.repas.model.repas;

@Repository
public interface repasRepository extends JpaRepository<repas,Integer>{

}
