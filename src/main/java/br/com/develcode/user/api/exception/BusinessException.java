package br.com.develcode.user.api.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice	
public class BusinessException extends ResponseEntityExceptionHandler {

	private static final String USUARIO_V1_CADASTRAR = "/usuario/v1/cadastrar";

	@Override
	  protected ResponseEntity<Object> handleMissingServletRequestParameter(
	      MissingServletRequestParameterException ex, HttpHeaders headers,
	      HttpStatus status, WebRequest request) {
			return new ResponseEntity<>(new ApiErrorResponse(USUARIO_V1_CADASTRAR, HttpStatus.BAD_REQUEST.value(),ex,"Parametro ["+ex.getParameterName()+"] ausente na requisicao", LocalDateTime.now()),status);
	      
	  }
}
