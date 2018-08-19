package br.comdiego.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.diego.jdbc.ConnectionPoolFactory;

public class TesteConexaoBancoDados {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;	
		conn = new ConnectionPoolFactory().getConnection();
		System.out.println("Conexao Estabelecida");
		conn.close();
		System.out.println("Conexao Encerrada");
	}
}
