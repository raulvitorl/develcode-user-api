package br.com.develcode.user.api.integration.resource;

public class JwtResponse {
    private String accessToken;
    private String tokenType;
    private String tipo;
    private boolean primeiroAcesso;
    private boolean temProposta;    
    
	public JwtResponse() {
		super();
	}
	
	public JwtResponse(String accessToken, String tokenType, String tipo, boolean primeiroAcesso, boolean temProposta) {
		super();
		this.accessToken = accessToken;
		this.tokenType = tokenType;
		this.tipo = tipo;
		this.primeiroAcesso = primeiroAcesso;
		this.temProposta = temProposta;
	}

	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isPrimeiroAcesso() {
		return primeiroAcesso;
	}
	public void setPrimeiroAcesso(boolean primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}
	public boolean isTemProposta() {
		return temProposta;
	}
	public void setTemProposta(boolean temProposta) {
		this.temProposta = temProposta;
	}

   
    
}