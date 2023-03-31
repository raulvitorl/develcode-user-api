package br.com.develcode.user.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@PostMapping("/userData")
	public ResponseEntity<?> cadastrarUsuario() {
		log.info("Recebendo inclusão de USUARIO");
		return null;
	}

	
}
