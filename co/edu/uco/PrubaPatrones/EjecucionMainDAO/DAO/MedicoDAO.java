package co.edu.uco.PrubaPatrones.EjecucionMainDAO.DAO;
import co.edu.uco.PrubaPatrones.EjecucionMainDAO.ModeloDAO.Medico;

public interface MedicoDAO extends CRUD<Medico> {
	
	void curar();

}
