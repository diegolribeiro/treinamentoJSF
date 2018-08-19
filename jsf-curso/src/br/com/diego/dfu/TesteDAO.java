package br.com.diego.dfu;

import java.sql.SQLException;
import java.util.List;

import br.com.diego.javaBean.TipoEvento;

public class TesteDAO {
	
	public static void main(String[] args) {
		
		EventoDAO dao = new EventoDAO();
		TipoEvento tipoEvento = new TipoEvento();
		tipoEvento.setId(1);
		tipoEvento.setCodigoExterno("teste");
		tipoEvento.setDescricaoEvento("teste");
		
		try {
			dao.cadastroTipoEvento(tipoEvento);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<TipoEvento> listaEventos = dao.getTipoEventos();
		for (TipoEvento evento : listaEventos) {
			System.out.println(evento.getCodigoExterno());
			System.out.println(evento.getDescricaoEvento());
		}
		
		
		
	}

}
