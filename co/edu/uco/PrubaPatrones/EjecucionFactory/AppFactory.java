package co.edu.uco.PrubaPatrones.EjecucionFactory;

import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.InterConexion;

public class AppFactory {
	
	public static void main(String[] args) {
		ConexionFactory factory = new ConexionFactory();
		
		InterConexion cx1 = factory.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();
		
		InterConexion cx2 = factory.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();
		
		InterConexion cx3 = factory.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
	}

}
