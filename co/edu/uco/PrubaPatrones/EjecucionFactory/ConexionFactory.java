package co.edu.uco.PrubaPatrones.EjecucionFactory;

import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.InterConexion;
import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.Implem.ConexionMySQL;
import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.Implem.ConexionOracle;
import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.Implem.ConexionPosgreSQL;
import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.Implem.ConexionVacia;

public class ConexionFactory {
	
	public InterConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPosgreSQL();
		}
		return new ConexionVacia();
	}

}
