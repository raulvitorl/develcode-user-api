package br.com.develcode.user.api.integration.resource;

public class LoginForm {
	
    private String username;

    private String password;

    private String recaptchaResponse;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRecaptchaResponse() {
        return recaptchaResponse;
    }

    public void setRecaptchaResponse(String recaptchaResponse) {
        this.recaptchaResponse = recaptchaResponse;
    }

	public LoginForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

    
}