package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO;

import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Medico;
import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Persona;
import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Profesor;

public class PersonaFactory {
	
	
	public static Persona crearPersona(String tipo, String nombre, int edad, String atributoEspecial, int id) {
        switch (tipo.toLowerCase()) {
            case "medico":
                return new Medico(nombre, edad, atributoEspecial, id);
            case "profesor":
                return new Profesor(nombre, edad, atributoEspecial, id);
            // Puedes agregar más tipos de personas aquí.
            default:
                throw new IllegalArgumentException("Tipo de persona desconocido.");
        }
    }

}