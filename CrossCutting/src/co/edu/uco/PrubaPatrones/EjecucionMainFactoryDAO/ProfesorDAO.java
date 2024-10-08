package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO;


import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Profesor;

public interface ProfesorDAO extends PersonaDAO<Profesor> {
	
	void enseñar();

}
