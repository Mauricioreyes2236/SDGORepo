package com.sdgor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sdgor.model.Usuario;
//import com.sdgor.repo.IPrivilegiosRepo;
import com.sdgor.repo.IUsuarioRepo;

@Controller
public class SdgorController {
	@Autowired
	private IUsuarioRepo repo;
	//private IPrivilegiosRepo repo1;
	
	@GetMapping("/greeting")
	public String insertar (@RequestParam(required=false, defaultValue="World") String name, Model model) {
		
		Usuario u = new Usuario();
		u.setId(1);
		u.setNombre("Mauricio");
		u.setApp("Reyes");
		u.setApm("Rojas");
		u.setEmail("al221811712@gmail.com");
		u.setTelefono_o("729 805 3994");
		u.setTelefono_c("722 505 9894");
		repo.save(u);
		
		return "greeting";
	}

}
