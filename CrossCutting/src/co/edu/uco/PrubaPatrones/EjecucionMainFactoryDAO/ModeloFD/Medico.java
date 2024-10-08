package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD;

public class Medico extends Persona {
	
	private String especialidad;
    
    public Medico(String nombre, int edad, String especialidad, int id) {
        super(nombre, edad, id);
        this.especialidad = especialidad;
    }
    
    

    public String getEspecialidad() {
		return especialidad;
	}

	@Override
    public String getDescripcion() {
        return "Medico: " + nombre + ", Especialidad: " + especialidad;
    }

}
