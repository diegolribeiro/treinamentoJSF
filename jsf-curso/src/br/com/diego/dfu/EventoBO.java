package br.com.diego.dfu;

import java.sql.SQLException;
import java.util.List;

import br.com.diego.javaBean.TipoEvento;

public class EventoBO {
	private EventoDAO eventoDAO = new EventoDAO();
	
	public void cadastraTipoEvento(TipoEvento tipoEvento) {
		try {
			eventoDAO.cadastroTipoEvento(tipoEvento);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public List<TipoEvento> listaEventos(){
		return eventoDAO.getTipoEventos();
		
	}
}
