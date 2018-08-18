package br.comdiego.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.diego.dfu.EventoDAO;
import br.com.diego.javaBean.TipoEvento;

public class TesteConsulta {
	public static void main(String[] args) {
		EventoDAO dao = new EventoDAO();
		List<TipoEvento> tipoEventos = new ArrayList<TipoEvento>();
		
		tipoEventos = dao.getTipoEventos();
		
		for (TipoEvento tpEvento : tipoEventos) {
			System.out.println(tpEvento.getId());
			System.out.println(tpEvento.getCodigoExterno());
			System.out.println(tpEvento.getDescricaoEvento());
		}
	}
}
