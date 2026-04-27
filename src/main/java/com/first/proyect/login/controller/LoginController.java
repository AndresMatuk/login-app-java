package com.first.proyect.login.controller;

import com.first.proyect.login.model.Cliente;
import com.first.proyect.login.model.ClienteDao;
import com.first.proyect.login.model.TipoDocumento;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/")
	public String mostrarLogin() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam String usuario, @RequestParam String contrasena, Model model) {

		ClienteDao dao = new ClienteDao();
		Cliente cliente = dao.obtenerUsuario(usuario, contrasena);

		if (cliente != null) {
			model.addAttribute("cliente", cliente);
			return "perfil";
		} else {
			return "error";
		}
	}

	@GetMapping("/registro")
	public String mostrarRegistro() {
		return "registro";
	}

	@PostMapping("/registrar")
	public String registrar(@RequestParam String tipoID, @RequestParam String nroID, @RequestParam String nombre,
			@RequestParam String apellido, @RequestParam String usuario, @RequestParam String contrasena,
			@RequestParam String noCelular, @RequestParam String correo) {

		TipoDocumento tipoDoc = TipoDocumento.valueOf(tipoID);

		ClienteDao dao = new ClienteDao();
		dao.insertarCliente(tipoDoc.name(), nroID, nombre, apellido, usuario, contrasena, noCelular, correo);

		return "login";
	}

}