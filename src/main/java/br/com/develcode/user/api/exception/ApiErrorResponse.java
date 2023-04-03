package br.com.develcode.user.api.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiErrorResponse {
    private String path;
    private int status;
    private Object error;
    private String message;
    private LocalDateTime createdAt;
    
    
    
	public ApiErrorResponse() {
		super();
	}



	public ApiErrorResponse(String path, int status, Object error, String message, LocalDateTime createdAt) {
		super();
		this.path = path;
		this.status = status;
		this.error = error;
		this.message = message;
		this.createdAt = createdAt;
	}



	public String getPath() {
		return path;
	}



	public void setPath(String path) {
		this.path = path;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public Object getError() {
		return error;
	}



	public void setError(Object error) {
		this.error = error;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
    
    
}
