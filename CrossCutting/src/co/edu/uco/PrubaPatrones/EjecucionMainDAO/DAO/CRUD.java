package co.edu.uco.PrubaPatrones.EjecucionMainDAO.DAO;
import java.util.List;


public interface CRUD<T> {
	
	List<T> listarTodos();
	T leerPorID (int id);
	void registrar(T persona);
	void actualizar(T persona);
	void eliminar(int id);

}