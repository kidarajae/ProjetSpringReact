package com.example.repas.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.repas.model.repas;
import com.example.repas.repository.repasRepository;

@Service
public class repasServiceImp implements repasService {
	@Autowired
	private repasRepository reR;

	@Override

	public repas saveRepas( repas A) {
		
		return reR.save(A);
	}

	@Override
	public List<repas> getAllRepas() {
		// TODO Auto-generated method stub
		return reR.findAll();
	}

	@Override
	public List<repas> get() {
		// TODO Auto-generated method stub
		return reR.findAll();
	}

}
