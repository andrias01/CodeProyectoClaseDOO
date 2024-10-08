package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO;

import java.util.List;





public interface PersonaDAO<T> {
	void guardar(T persona);
    T obtenerPorId(int id);
    List<T> listarTodos();
	void actualizar(T persona);
	T eliminar(int id);

}
