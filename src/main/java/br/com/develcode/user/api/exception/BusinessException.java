package br.com.develcode.user.api.exception;

import java.util.List;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 7482536665167468178L;

	private Integer status;

    private String message;

    private List<String> details;

	public BusinessException() {
		super();
	}

	public BusinessException(Integer status, String message, List<String> details) {
		super();
		this.status = status;
		this.message = message;
		this.details = details;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
