package co.edu.uco.connectionJBDC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionWithBaseDatos {
	
	private final String url = "jdbc:postgresql://localhost:5432/LocalBaseDatosJava";
	private final String user = "postgres";
	private final String password = "123456";
	

	
	private void connect() {
		try(Connection connection = DriverManager.getConnection(url, user, password);){
			if(connection != null) {
				//para octener el hostname del gestor de datos en tu base poner la siguente consulta
				// SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port')
				System.out.print("Connection succesfull");
				
				// el stetement es para ejecutar los executeQuery y los executeUpdate
				//java.sql.Statement miStatement = connection.createStatement();
				
				//este primer string es para practicar las sentencias preparadas
				String instruccionSQL="SELECT id,nombre_completo,rol_id FROM USUARIOS WHERE rol_id=?";
				
				//String instruccionSQL="DELETE FROM USUARIOS WHERE ID=3";
				//String instruccionSQL="UPDATE USUARIOS SET contraseña='PASSWORDandresito' WHERE ID=3";
				//String instruccionSQL="INSERT INTO USUARIOS (id,nombre_completo, correo, contraseña, rol_id) VALUES (5,'Juan Avendaño','zuzicol@gmail.com','pgAdmin',1)";
				//miStatement.executeUpdate(instruccionSQL);
				
				PreparedStatement miSentencia = connection.prepareStatement(instruccionSQL);
				//miSentencia.setLong(primer ?, valor a poner);
				miSentencia.setLong(1, 1);
				
				System.out.print("\n Actualizo la base");
				
				//se usa para los select los cuales son para statement y el preparedStatement
				ResultSet miResultset = miSentencia.executeQuery();
				while(miResultset.next()) {
					//System.out.print("\n"+miResultset.getString("nombre_completo"));
					System.out.print("\n"+miResultset.getString(1)+" "+miResultset.getString(2)+" "+miResultset.getString(3) );
				}
				miResultset.close();
				
			}else {
				System.out.print("Failed to connect Post");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		ConexionWithBaseDatos sqlConnect = new ConexionWithBaseDatos();
//		sqlConnect.connect();
//	}
			
	

}
