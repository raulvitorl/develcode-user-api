package br.com.develcode.user.api.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.develcode.user.api.usecase.CadastrarUsuarioUseCase;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CadastrarUsuarioUseCase cadastrarUsuarioUseCase;
	
	@PostMapping(path = "/v1/cadastrar" , consumes = {"multipart/form-data"})
	public ResponseEntity<?> cadastrarUsuario(
			@RequestParam(value = "codigo") String codigo,
			 @RequestParam(value = "nome") String nome,
			 @RequestParam(value = "data_nascimento") String dataNascimento,
			 @RequestParam(value = "foto") MultipartFile foto,
				 HttpServletRequest request) throws ParseException {
		log.info("Recebendo inclusão de USUARIO");
		return cadastrarUsuarioUseCase.execute(codigo, nome, dataNascimento, foto, request);
	}

	
}
