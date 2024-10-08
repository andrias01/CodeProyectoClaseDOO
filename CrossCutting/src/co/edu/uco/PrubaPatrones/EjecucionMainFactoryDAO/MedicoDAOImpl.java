package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Medico;



public class MedicoDAOImpl implements MedicoDAO {
	
	private static final String INSERT_MEDICO_SQL = "INSERT INTO medico (nombre, edad, especialidad, id) VALUES (?, ?, ?, ?)";
    private static final String SELECT_MEDICO_BY_ID = "SELECT * FROM medico WHERE id = ?";
    private static final String DELETE_MEDICO_BY_ID = "DELETE FROM medico WHERE id=?";
    private static final String UPDATE_MEDICO_BY_ID = "UPDATE medico SET especialidad='PASSWORDandresito' WHERE id=?";
 
	@Override
	public void guardar(Medico persona) {
		Medico medico = persona; // Casting, porque sabemos que es un Medico
        try (Connection connection = ConexionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_MEDICO_SQL)) {
            
            preparedStatement.setString(1, medico.getNombre());
            preparedStatement.setInt(2, medico.getEdad());
            preparedStatement.setString(3, medico.getEspecialidad());
            preparedStatement.setInt(4,medico.getId());

            preparedStatement.executeUpdate();
            System.out.println("Medico guardado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
		// TODO Auto-generated method stub
		
	}

	@Override
	public Medico obtenerPorId(int id) {
		Medico medico = null;
        try (Connection connection = ConexionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MEDICO_BY_ID)) {
            
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String especialidad = rs.getString("especialidad");
                medico = new Medico(nombre, edad, especialidad, id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medico;
	}

	@Override
	public List<Medico> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Medico persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Medico eliminar(int id) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void curar() {
		// TODO Auto-generated method stub
		
	}

	

}