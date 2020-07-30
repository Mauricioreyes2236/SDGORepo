package com.sdgor.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sdgor.model.Cliente;
import com.sdgor.model.Usuario;
import com.sdgor.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/cliente")
	public String cliente(Model model) {
			model.addAttribute("userForm", new Usuario());
			model.addAttribute("usuarioList",clienteService.getAllClientes());
			model.addAttribute("listTab","active");
		return "ltr/clienteForm";
	}
	@GetMapping("/inicio")
	public String inicio() {
		return "ltr/index";
	}
	@PostMapping("/clienteForm")
	public String createCliente( ModelMap model,@ModelAttribute("clienteForm")Cliente cliente, BindingResult result) throws Exception {
			model.addAttribute("clienteForm",cliente);
			clienteService.createCliente(cliente);
			model.addAttribute("clienteForm",new Cliente());
			return "ltr/index";
		}
	
}
