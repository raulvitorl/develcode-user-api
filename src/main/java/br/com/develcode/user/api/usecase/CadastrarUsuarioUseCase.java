package br.com.develcode.user.api.usecase;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface CadastrarUsuarioUseCase {

	ResponseEntity<?> execute(String codigo,String nome,String dataNascimento, MultipartFile foto,HttpServletRequest request) throws ParseException;
	
}
