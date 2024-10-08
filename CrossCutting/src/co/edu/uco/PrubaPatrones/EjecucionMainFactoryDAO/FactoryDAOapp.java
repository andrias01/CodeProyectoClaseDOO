package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO;

import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Medico;
import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Persona;
import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Profesor;

public class FactoryDAOapp {
	public static void main(String[] args) {
//		// Crear una persona usando el patrón Factory
//        Persona medico = PersonaFactory.crearPersona("medico", "Dr. Juan", 40, "Pediatría");
//        Persona profesor = PersonaFactory.crearPersona("profesor", "Sra. María", 35, "Historia");
//
//        // Guardar las personas usando los DAOs
//        PersonaDAO medicoDAO = new MedicoDAO();
//        medicoDAO.guardar(medico);
//
//        PersonaDAO profesorDAO = new ProfesorDAO();
//        profesorDAO.guardar(profesor);
//
//        // Recuperar y mostrar una persona desde el DAO
//        Persona medicoRecuperado = medicoDAO.obtenerPorId(1);
//        System.out.println(medicoRecuperado.getDescripcion());
        
     // Crear una persona usando el patrón Factory
//        Persona medico = PersonaFactory.crearPersona("medico", "Dr. Juan", 40, "Pediatría", 4);
//        Persona profesor = PersonaFactory.crearPersona("profesor", "Sra. María", 35, "Historia", 6);
//
//        // Guardar las personas usando los DAOs
//        PersonaDAO<Medico> medicoDAO = new MedicoDAOImpl();
//        medicoDAO.guardar((Medico) medico);
//
        PersonaDAO<Profesor> profesorDAO = new ProfesorDAOImpl();
//        profesorDAO.guardar((Profesor) profesor);

        // Recuperar y mostrar una persona desde el DAO
        Persona profesorRecuperado = profesorDAO.obtenerPorId(1);
        System.out.println(profesorRecuperado.getDescripcion());
        Persona profesorEliminado = profesorDAO.eliminar(1);
        
////	CRUD<Medico> daoP = new MedicoDAOImpl();
////	daoP.listarTodos().forEach(x -> System.out.print(x.getNombres() + x.getId()));
	}

}
