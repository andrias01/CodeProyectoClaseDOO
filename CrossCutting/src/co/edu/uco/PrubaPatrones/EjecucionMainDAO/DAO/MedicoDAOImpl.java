package co.edu.uco.PrubaPatrones.EjecucionMainDAO.DAO;

import java.util.ArrayList;
import java.util.List;

import co.edu.uco.PrubaPatrones.EjecucionMainDAO.ModeloDAO.Medico;

public class MedicoDAOImpl implements MedicoDAO{

	@Override
	public List<Medico> listarTodos() {
		List<Medico> lista = new ArrayList<>();
		Medico med = new Medico();
		med.setId(1);
		med.setNombres("AntionioMdico");
		lista.add(med);
		
		
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Medico leerPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Medico persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Medico persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void curar() {
		// TODO Auto-generated method stub
		
	}

}