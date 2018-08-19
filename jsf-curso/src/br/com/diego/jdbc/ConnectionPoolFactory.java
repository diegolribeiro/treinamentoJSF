package br.com.diego.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.microsoft.sqlserver.jdbc.SQLServerXADataSource;



public class ConnectionPoolFactory {
	
	
	private DataSource dataSource;

	public ConnectionPoolFactory() {
		SQLServerXADataSource pool = new SQLServerXADataSource();
		pool.setURL("jdbc:sqlserver://localhost");
		pool.setPortNumber(1433);
		pool.setDatabaseName("BASE_JAVA");
		pool.setUser("USER_JAVA");
		pool.setPassword("user_java");
		this.dataSource = pool;
	}
	
	public Connection getConnection() throws SQLException {
		/*try {
			return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +  
			     "databaseName=BASE_JAVA;user=USER_JAVA;password=");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}*/
		
		Connection connection = dataSource.getConnection();
		return connection;
	}
	
	/*public static void main(String[] args) {  

	      // Create a variable for the connection string.  
	      String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
	         "databaseName=BASE_JAVA;user=USER_JAVA;password=user_java";  

	      // Declare the JDBC objects.  
	      Connection con = null;  
	      Statement stmt = null;  
	      ResultSet rs = null;  

	      try {  
	         // Establish the connection.  
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	         con = DriverManager.getConnection(connectionUrl);  

	         // Create and execute an SQL statement that returns some data.  
	         String SQL = "SELECT TOP 10 * FROM Contact";  
	         stmt = con.createStatement();  
	         rs = stmt.executeQuery(SQL);  

	         // Iterate through the data in the result set and display it.  
	         while (rs.next()) {  
	            System.out.println(rs.getInt("id"));  
	         }  
	      }  

	      // Handle any errors that may have occurred.  
	      catch (Exception e) {  
	         e.printStackTrace();  
	      }  
	      finally {  
	         if (rs != null) try { rs.close(); } catch(Exception e) {}  
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	         if (con != null) try { con.close(); } catch(Exception e) {}  
	      }  
	   }*/

}
