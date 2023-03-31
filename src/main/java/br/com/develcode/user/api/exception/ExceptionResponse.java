package br.com.develcode.user.api.exception;

import java.io.Serializable;
import java.util.List;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = -7097915733265252835L;

	private String code;

	private String message;

	private List<String> details;	
	
	public ExceptionResponse() {
		super();
	}

	public ExceptionResponse(String code, String message, List<String> details) {
		super();
		this.code = code;
		this.message = message;
		this.details = details;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}
	
	

}
