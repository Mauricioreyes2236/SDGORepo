package com.sdgor.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sdgor.model.Usuario;
import com.sdgor.repo.IPrivilegiosRepo;
import com.sdgor.service.UsuarioService;

@Controller
public class UserController {
	
	@Autowired
	UsuarioService usuarioService; 

	@Autowired
	IPrivilegiosRepo iPrivilegiosRepo; 
	
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/oa")
	public String ind() {
		return "user-form/plantilla";
	}
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new Usuario());
		model.addAttribute("usuarioList",usuarioService.getAllUsuarios());
		model.addAttribute("privilegios",iPrivilegiosRepo.findAll());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}	
	
	@PostMapping("/userForm")
	public String createUsuario( ModelMap model, @Valid @ModelAttribute("userForm")Usuario usuario, BindingResult result) throws Exception {
		if(result.hasErrors()) {
			model.addAttribute("userForm", usuario);
			model.addAttribute("formTab",	"active");
		}else {
				usuarioService.createUsuario(usuario);
				model.addAttribute("userForm",new Usuario());
				model.addAttribute("listTab",	"active");
			}
		model.addAttribute("usuarioList",usuarioService.getAllUsuarios());
		model.addAttribute("privilegios",iPrivilegiosRepo.findAll());
		return "user-form/user-view";
	}
	@GetMapping("/editUser/{Id}")
	public String getEditUsuarioForm(Model model, @PathVariable(name ="Id")Integer Id)throws Exception{
		Usuario usuarioToEdit = usuarioService.getUsuarioById(Id);
		model.addAttribute("userForm", usuarioToEdit);
		model.addAttribute("usuarioList",usuarioService.getAllUsuarios());
		model.addAttribute("privilegios",iPrivilegiosRepo.findAll());
		model.addAttribute("formTab","active");
		model.addAttribute("editMode",true);
		return "user-form/user-view";
	}
}