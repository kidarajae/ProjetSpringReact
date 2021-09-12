package com.example.repas.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.repas.model.repas;
import com.example.repas.service.repasService;
import com.example.repas.service.repasServiceImp;

@RestController
@RequestMapping("/repas")
@CrossOrigin("*")
public class repasController {

	@Autowired
	private repasService reS;

	//@PostMapping(value ="/saveRepas")
	@RequestMapping("/saveRepas")
	@ResponseBody
	public String createRepas(@RequestBody
			repas R) {
		reS.saveRepas( R);

		return "repas addeeeed";
	}
	@PostMapping("/getAll")
	public List<repas> get() {
		return reS.get();
	}

}
