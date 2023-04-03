package br.com.develcode.user.api.usecase.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.develcode.user.api.exception.ApiErrorResponse;
import br.com.develcode.user.api.model.Usuario;
import br.com.develcode.user.api.repository.UsuarioRepository;
import br.com.develcode.user.api.usecase.CadastrarUsuarioUseCase;

@Service
public class CadastrarUsuarioUseCaseImpl implements CadastrarUsuarioUseCase{
	
	private static final String SEMFOTO_PNG = "fotos/semfoto.png";

	@Autowired
	private  UsuarioRepository usuarioRepository;
	
	private static final String USUARIO_V1_CADASTRAR = "/usuario/v1/cadastrar";

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public ResponseEntity<?> execute(String codigo,String nome,String dataNascimento, MultipartFile foto,HttpServletRequest request) throws ParseException {
		
		Usuario usuarioVerificacao = usuarioRepository.findByCodigo(codigo);
		
		if(usuarioVerificacao!=null){
			return new ResponseEntity<>(new ApiErrorResponse(USUARIO_V1_CADASTRAR, HttpStatus.CONFLICT.value(), null, "Já existe um usuário cadastrado com este código.", LocalDateTime.now()),HttpStatus.CONFLICT);
		}
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		java.util.Date dataFormatada = formato.parse(dataNascimento); 
		String caminhoArquivo = SEMFOTO_PNG;
		try {
			salvarImagemLocalmente(foto);
		} catch (IOException e) {
			log.error("Não foi possivel salvar a imagem "+foto.getOriginalFilename()+" do usuario CODIGO["+codigo+"]");
		}
		
		Usuario usuario = new Usuario(null, codigo, nome, dataFormatada,caminhoArquivo);
		return new ResponseEntity<>(usuarioRepository.save(usuario), HttpStatus.CREATED);
	}
	
	public String salvarImagemLocalmente(MultipartFile file) throws IOException {
		String caminhoArquivo = "fotos/"+file.getOriginalFilename();
        File convFile        = new File(caminhoArquivo);
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return caminhoArquivo;
    }

}
