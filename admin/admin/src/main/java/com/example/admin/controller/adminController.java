package com.example.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.admin.VO.repas;
import com.example.admin.model.admin;
import com.example.admin.service.adminService;
import com.example.admin.service.adminServiceint;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/admin")
@Slf4j
@CrossOrigin
public class adminController {
	@Autowired
	private adminServiceint adS;
	@PostMapping("/add")
	public String add(@RequestBody admin A) {
		adS.saveAdmin(A);
		return "admin added";
	}
	
	@PostMapping("/getAll")
	public List<admin> find() {
		
		return adS.getAllAdmin();
	}
	@PostMapping("/set")
	 @ResponseBody
	public  String set( @RequestBody repas R) {
		adS.setRepas(R);
		return "reeeeepas addddddeeedddd ";
	}
}
