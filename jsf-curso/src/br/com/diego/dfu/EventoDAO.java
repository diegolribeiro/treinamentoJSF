package br.com.diego.dfu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.diego.javaBean.TipoEvento;
import br.com.diego.jdbc.ConnectionPoolFactory;

public class EventoDAO {

	private Connection conn = null;

	public EventoDAO() {
		try {
			conn = new ConnectionPoolFactory().getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void cadastroTipoEvento(TipoEvento tipoEvento) throws SQLException {
		boolean procOK = false;
		try {
			
			conn.setAutoCommit(false);
			PreparedStatement ps = null;

			String sql = "INSERT INTO TIPO_EVENTO (ID_TIPO_EVENTO, CODIGO_EXTERNO, DESCRICAO_TIPO_EVENTO) "
					+ "VALUES(?,?,?)";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, tipoEvento.getId());
			ps.setString(2, tipoEvento.getCodigoExterno());
			ps.setString(3, tipoEvento.getDescricaoEvento());
			procOK = true && ps.execute();
			
			conn.commit();
			ps.close();
			
		} catch (SQLException e) {
			
			conn.rollback();
			e.printStackTrace();
			procOK = false;
			
		}
	}

	public List<TipoEvento> getTipoEventos() {

		boolean procOK = false;
		List<TipoEvento> tipoEventos = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM TIPO_EVENTO";

		try {

			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			tipoEventos = new ArrayList<TipoEvento>();

			while (rs.next()) {
				TipoEvento tipoEvento = new TipoEvento();
				tipoEvento.setId(rs.getInt("ID_TIPO_EVENTO"));
				tipoEvento.setCodigoExterno(rs.getString("CODIGO_EXTERNO"));
				tipoEvento.setDescricaoEvento(rs.getString("DESCRICAO_TIPO_EVENTO"));
								
				tipoEventos.add(tipoEvento);
				
				tipoEvento = null;
				
			}
			
			procOK = procOK && true;
			
			rs.close();
			ps.close();
			
			return tipoEventos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tipoEventos;
	}

}
