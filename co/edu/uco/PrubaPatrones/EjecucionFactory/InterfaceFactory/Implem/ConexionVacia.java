package co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.Implem;

import co.edu.uco.PrubaPatrones.EjecucionFactory.InterfaceFactory.InterConexion;

public class ConexionVacia implements InterConexion {

	@Override
	public void conectar() {
		System.out.print("NO SE ESPECIFICÓ PROVEEDOR \n");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desconectar() {
		System.out.print("NO SE ESPECIFICÓ PROVEEDOR \n");
		// TODO Auto-generated method stub
		
	}

}