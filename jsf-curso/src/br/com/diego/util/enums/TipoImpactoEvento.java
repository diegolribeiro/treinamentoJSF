package br.com.diego.util.enums;

public enum TipoImpactoEvento {
	INFORMATIVO(0),
	PLANEJAMENTO(1),
	REPOSICAO(2),
	PLANEJAMENTOEREPOSICAO(3);

	private int tipoImpacto;

	TipoImpactoEvento(int tipo){
		this.tipoImpacto = tipo;
	}
	
	public int getTipoImpacto() {
		return tipoImpacto;
	}
}
