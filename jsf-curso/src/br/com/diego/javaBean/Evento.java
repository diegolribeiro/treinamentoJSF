package br.com.diego.javaBean;

import java.util.Calendar;

public class Evento {
	
	private TipoEvento tipoEvento;
	private String codigoExterno;
	private String descricao;
	private Calendar dataInicial = Calendar.getInstance();
	private Calendar dataFinal = Calendar.getInstance();
	private double impactoPercentual;
	private double impactoAbsoluto;
	
	public String getCodigoExterno() {
		return codigoExterno;
	}

	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public double getImpactoPercentual() {
		return impactoPercentual;
	}

	public void setImpactoPercentual(double impactoPercentual) {
		this.impactoPercentual = impactoPercentual;
	}

	public double getImpactoAbsoluto() {
		return impactoAbsoluto;
	}

	public void setImpactoAbsoluto(double impactoAbsoluto) {
		this.impactoAbsoluto = impactoAbsoluto;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	

}
