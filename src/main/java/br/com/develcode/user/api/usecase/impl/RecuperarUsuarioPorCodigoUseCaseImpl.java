package br.com.develcode.user.api.usecase.impl;

import java.text.ParseException;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.develcode.user.api.exception.ApiErrorResponse;
import br.com.develcode.user.api.model.Usuario;
import br.com.develcode.user.api.repository.UsuarioRepository;
import br.com.develcode.user.api.usecase.RecuperarUsuarioPorCodigoUseCase;

@Service
public class RecuperarUsuarioPorCodigoUseCaseImpl implements RecuperarUsuarioPorCodigoUseCase{
	
	private static final String V1_RECUPERAR_CODIGO = "/v1/recuperar/{codigo}";

	@Autowired
	private  UsuarioRepository usuarioRepository;

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public ResponseEntity<?> execute(String codigo) throws ParseException {
		Usuario usuario = usuarioRepository.findByCodigo(codigo);
		
		if(usuario!=null){
			log.info("Usuario encontrado, retornando.");
			return new ResponseEntity<>(usuarioRepository.save(usuario), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ApiErrorResponse(V1_RECUPERAR_CODIGO, HttpStatus.NOT_FOUND.value(), null, "Não existe nenhum usuário cadastrado com este código {"+codigo+"}", LocalDateTime.now()),HttpStatus.NOT_FOUND);
		
	}
	
}
