package co.edu.uco.PrubaPatrones.EjecucionMainDAO.DAO;

import co.edu.uco.PrubaPatrones.EjecucionMainDAO.ModeloDAO.Persona;

public interface PersonaDAO extends CRUD<Persona> {
	
	void mostrarNombre();
}