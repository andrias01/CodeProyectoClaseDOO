package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO;


import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Medico;


public interface MedicoDAO extends PersonaDAO<Medico> {
	
	void curar();

}
