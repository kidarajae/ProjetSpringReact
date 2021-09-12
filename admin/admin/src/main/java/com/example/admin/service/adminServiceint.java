package com.example.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.admin.VO.ResponseTemplateVO;
import com.example.admin.VO.repas;
import com.example.admin.model.admin;
import com.example.admin.repository.adminRepository;

@Service

public class adminServiceint implements adminService  {
	@Autowired
	private RestTemplate RT;

	@Autowired
private adminRepository  adR;
	
	@Override
	
	public admin saveAdmin (admin A) {
		return adR.save(A);
	}

	@Override
	public List<admin> getAllAdmin() {
		
		return adR.findAll();
	}
	public String setRepas(repas R) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<repas> httpEntity = new HttpEntity<>(R, headers);
		RT.postForObject("http://localhost:8080/repas/saveRepas",httpEntity, repas.class);
		return("repaaaaas added");
	}
}
