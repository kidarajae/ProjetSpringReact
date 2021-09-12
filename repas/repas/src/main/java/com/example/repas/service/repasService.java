package com.example.repas.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.repas.model.repas;


public interface repasService {
	
	public List<repas>  getAllRepas();
	public repas saveRepas(repas r);
	
	 List<repas> get();
}
