package br.com.develcode.user.api.integration.resource;

public class EntradaSimulacao {
	
    private Long idAdministradora;
    private Long tipoConsorcioId;
    private double valorCredito;
    private Long prazoPlano;
    private Long assembleiasARealizar;
    private Long parcelasPagas;
    private double saldoDevedorAtualizado;
    private double percentualEncargosMultasTaxas;
    private Long clienteConsorcioId;
    private String numeroGrupo;
    private double percentualFundoComumPago;
    private String situacaoCota;
    
	public EntradaSimulacao() {
		super();
	}

	public EntradaSimulacao(Long idAdministradora, Long tipoConsorcioId, double valorCredito, Long prazoPlano,
			Long assembleiasARealizar, Long parcelasPagas, double saldoDevedorAtualizado,
			double percentualEncargosMultasTaxas, Long clienteConsorcioId, String numeroGrupo,
			double percentualFundoComumPago, String situacaoCota) {
		super();
		this.idAdministradora = idAdministradora;
		this.tipoConsorcioId = tipoConsorcioId;
		this.valorCredito = valorCredito;
		this.prazoPlano = prazoPlano;
		this.assembleiasARealizar = assembleiasARealizar;
		this.parcelasPagas = parcelasPagas;
		this.saldoDevedorAtualizado = saldoDevedorAtualizado;
		this.percentualEncargosMultasTaxas = percentualEncargosMultasTaxas;
		this.clienteConsorcioId = clienteConsorcioId;
		this.numeroGrupo = numeroGrupo;
		this.percentualFundoComumPago = percentualFundoComumPago;
		this.situacaoCota = situacaoCota;
	}

	public Long getIdAdministradora() {
		return idAdministradora;
	}

	public void setIdAdministradora(Long idAdministradora) {
		this.idAdministradora = idAdministradora;
	}

	public Long getTipoConsorcioId() {
		return tipoConsorcioId;
	}

	public void setTipoConsorcioId(Long tipoConsorcioId) {
		this.tipoConsorcioId = tipoConsorcioId;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Long getPrazoPlano() {
		return prazoPlano;
	}

	public void setPrazoPlano(Long prazoPlano) {
		this.prazoPlano = prazoPlano;
	}

	public Long getAssembleiasARealizar() {
		return assembleiasARealizar;
	}

	public void setAssembleiasARealizar(Long assembleiasARealizar) {
		this.assembleiasARealizar = assembleiasARealizar;
	}

	public Long getParcelasPagas() {
		return parcelasPagas;
	}

	public void setParcelasPagas(Long parcelasPagas) {
		this.parcelasPagas = parcelasPagas;
	}

	public double getSaldoDevedorAtualizado() {
		return saldoDevedorAtualizado;
	}

	public void setSaldoDevedorAtualizado(double saldoDevedorAtualizado) {
		this.saldoDevedorAtualizado = saldoDevedorAtualizado;
	}

	public double getPercentualEncargosMultasTaxas() {
		return percentualEncargosMultasTaxas;
	}

	public void setPercentualEncargosMultasTaxas(double percentualEncargosMultasTaxas) {
		this.percentualEncargosMultasTaxas = percentualEncargosMultasTaxas;
	}

	public Long getClienteConsorcioId() {
		return clienteConsorcioId;
	}

	public void setClienteConsorcioId(Long clienteConsorcioId) {
		this.clienteConsorcioId = clienteConsorcioId;
	}

	public String getNumeroGrupo() {
		return numeroGrupo;
	}

	public void setNumeroGrupo(String numeroGrupo) {
		this.numeroGrupo = numeroGrupo;
	}

	public double getPercentualFundoComumPago() {
		return percentualFundoComumPago;
	}

	public void setPercentualFundoComumPago(double percentualFundoComumPago) {
		this.percentualFundoComumPago = percentualFundoComumPago;
	}

	public String getSituacaoCota() {
		return situacaoCota;
	}

	public void setSituacaoCota(String situacaoCota) {
		this.situacaoCota = situacaoCota;
	}
    
}
