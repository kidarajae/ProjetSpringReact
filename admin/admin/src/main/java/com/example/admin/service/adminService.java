package com.example.admin.service;

import java.util.List;

import com.example.admin.model.admin;

public interface adminService {

	public admin saveAdmin(admin A);
	public List<admin>  getAllAdmin();
}
