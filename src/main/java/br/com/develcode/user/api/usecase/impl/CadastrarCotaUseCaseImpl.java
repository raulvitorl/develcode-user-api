package br.com.develcode.user.api.usecase.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.develcode.user.api.model.Usuario;
import br.com.develcode.user.api.repository.UsuarioRepository;
import br.com.develcode.user.api.usecase.CadastrarUsuarioUseCase;

@Service
public class CadastrarCotaUseCaseImpl implements CadastrarUsuarioUseCase{
	
	@Autowired
	private  UsuarioRepository usuarioRepository;

	@Override
	public ResponseEntity<?> execute(String codigo,String nome,String dataNascimento, MultipartFile foto,HttpServletRequest request) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		java.util.Date dataFormatada = formato.parse(dataNascimento); 
		Usuario usuario = new Usuario(null, codigo, nome, dataFormatada, "semfoto");
		return new ResponseEntity<>(usuarioRepository.save(usuario), HttpStatus.CREATED);
	}

}
