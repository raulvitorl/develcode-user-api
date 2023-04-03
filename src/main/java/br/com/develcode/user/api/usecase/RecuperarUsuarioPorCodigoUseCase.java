package br.com.develcode.user.api.usecase;

import java.text.ParseException;

import org.springframework.http.ResponseEntity;

public interface RecuperarUsuarioPorCodigoUseCase {

	ResponseEntity<?> execute(String codigo) throws ParseException;
	
}
