package co.edu.uco.PrubaPatrones.EjecucionMainDAO.DAO;
import java.util.ArrayList;
import java.util.List;

import co.edu.uco.PrubaPatrones.EjecucionMainDAO.ModeloDAO.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	@Override
	public List<Persona> listarTodos() {
		List<Persona> lista = new ArrayList<>();
		Persona per = new Persona();
		per.setId(1);
		per.setNombres("Andres");
		lista.add(per);
		
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Persona leerPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Persona persona) {
		System.out.print("Persona "+ persona.getNombres()+ " registrada");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Persona persona) {
		System.out.print("Persona "+ persona.getNombres()+ " actualizada");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int id) {
		System.out.print("id "+ id + " eliminado");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarNombre() {
		// TODO Auto-generated method stub
		
	}

}