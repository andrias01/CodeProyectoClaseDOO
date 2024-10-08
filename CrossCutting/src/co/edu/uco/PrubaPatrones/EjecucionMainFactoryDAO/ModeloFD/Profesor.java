package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD;

public class Profesor extends Persona{
	private String asignatura;
    
    public Profesor(String nombre, int edad, String asignatura, int id) {
        super(nombre, edad, id);
        this.asignatura = asignatura;
    }
    
    

    public String getAsignatura() {
		return asignatura;
	}

	@Override
    public String getDescripcion() {
        return "Profesor: " + nombre + ", Asignatura: " + asignatura;
    }

}
