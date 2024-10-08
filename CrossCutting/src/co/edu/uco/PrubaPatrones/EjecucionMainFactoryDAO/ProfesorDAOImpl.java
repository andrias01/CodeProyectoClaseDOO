package co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import co.edu.uco.PrubaPatrones.EjecucionMainFactoryDAO.ModeloFD.Profesor;

public class ProfesorDAOImpl implements ProfesorDAO {
	
	private static final String INSERT_PROFESOR_SQL = "INSERT INTO profesor (nombre, edad, asignatura, id) VALUES (?, ?, ?, ?)";
    private static final String SELECT_PROFESOR_BY_ID = "SELECT * FROM profesor WHERE id = ?";
    private static final String DELETE_PROFESOR_BY_ID = "DELETE FROM profesor WHERE id=?";
    private static final String UPDATE_PROFESOR_BY_ID = "UPDATE profesor SET asignatura='PASSWORDandresito' WHERE id=?";

	@Override
	public void guardar(Profesor persona) {
		Profesor profesor = persona; 
        try (Connection connection = ConexionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PROFESOR_SQL)) {
            
            preparedStatement.setString(1, profesor.getNombre());
            preparedStatement.setInt(2, profesor.getEdad());
            preparedStatement.setString(3, profesor.getAsignatura());
            preparedStatement.setInt(4, profesor.getId());

            preparedStatement.executeUpdate();
            System.out.println("Profesor guardado exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profesor obtenerPorId(int id) {
		
		Profesor profesor = null;
        try (Connection connection = ConexionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PROFESOR_BY_ID)) {
            
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String asignatura = rs.getString("asignatura");
                profesor = new Profesor(nombre, edad, asignatura, id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profesor;
	}

	@Override
	public List<Profesor> listarTodos() {
		try(Connection connection = DriverManager.getConnection(url, user, password);){
			if(connection != null) {
				//para octener el hostname del gestor de datos en tu base poner la siguente consulta
				// SHOW VARIABLES WHERE VARIABLE_NAME IN('hostname','port')
				System.out.print("Connection succesfull");
				
				// el stetement es para ejecutar los executeQuery y los executeUpdate
				//java.sql.Statement miStatement = connection.createStatement();
				
				//este primer string es para practicar las sentencias preparadas
				String instruccionSQL="SELECT id,nombre_completo,rol_id FROM USUARIOS WHERE rol_id=?";
				
				//String instruccionSQL="DELETE FROM USUARIOS WHERE ID=3";
				//String instruccionSQL="UPDATE USUARIOS SET contraseña='PASSWORDandresito' WHERE ID=3";
				//String instruccionSQL="INSERT INTO USUARIOS (id,nombre_completo, correo, contraseña, rol_id) VALUES (5,'Juan Avendaño','zuzicol@gmail.com','pgAdmin',1)";
				//miStatement.executeUpdate(instruccionSQL);
				
				PreparedStatement miSentencia = connection.prepareStatement(instruccionSQL);
				//miSentencia.setLong(primer ?, valor a poner);
				miSentencia.setLong(1, 1);
				
				System.out.print("\n Actualizo la base");
				
				//se usa para los select los cuales son para statement y el preparedStatement
				ResultSet miResultset = miSentencia.executeQuery();
				while(miResultset.next()) {
					//System.out.print("\n"+miResultset.getString("nombre_completo"));
					System.out.print("\n"+miResultset.getString(1)+" "+miResultset.getString(2)+" "+miResultset.getString(3) );
				}
				miResultset.close();
				
			}else {
				System.out.print("Failed to connect Post");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Profesor persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Profesor eliminar(int id) {
		try (Connection connection = ConexionDB.getConnection()){
	             
			PreparedStatement preparedStatement = (PreparedStatement) connection.createStatement();
			preparedStatement.executeUpdate(DELETE_PROFESOR_BY_ID);
				
			
		} catch (SQLException e) {
            e.printStackTrace();
        }
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public void enseñar() {
		// TODO Auto-generated method stub
		
	}

}
