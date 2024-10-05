package co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.Implem;

import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.InterConexion;

public class ConexionMySQL implements InterConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;
	
	
	
	public ConexionMySQL() {
		this.host = "localHost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	@Override
	public void conectar() {
		System.out.print("Se conectó a MySQL \n");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desconectar() {
		System.out.print("Se desconectó de MySQL \n");
		// TODO Auto-generated method stub
		
	}

}
