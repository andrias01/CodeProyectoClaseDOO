package co.edu.uco.ucobet.data.dao.impl.sqlserver;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.TextHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.crosscutting.exceptions.DataUcoBetException;
import co.edu.uco.ucobet.data.dao.CountryDAO;
import co.edu.uco.ucobet.data.dao.impl.sql.SqlDAO;
import co.edu.uco.ucobet.entity.CountryEntity;

public final class CountrySqlServerDAO extends SqlDAO implements CountryDAO {

//	private final String url = "jdbc:sqlserver://ucobet-server.database.windows.net:1433;database=ucobet-db";
//	private final String user = "ucobetdbuser";
//	private final String password = "uc0b3tdbus3r!";
	
	public CountrySqlServerDAO(Connection connection) {
		super(connection);
		
	}

	private final String url = "jdbc:postgresql://localhost:5432/baseJavaPractica";
	private final String user = "postgres";
	private final String password = "123456";
	
	@Override
	public CountryEntity fingByID(UUID id) {
		var countryEntityFilter = new CountryEntity();
		countryEntityFilter.setId(id);
		
		var result = findByFilter(countryEntityFilter);
		return (result.isEmpty()) ? new CountryEntity() : result.get(0);
//		String instruccionSQL = "SELECT id, nombre FROM country WHERE id = ?";
//	    CountryEntity country = null; // Instancia para almacenar el resultado
//	    
//	    try (Connection connection = DriverManager.getConnection(url, user, password)) {
//	        if (connection != null) {
//	            PreparedStatement miSentencia = connection.prepareStatement(instruccionSQL);
//	            miSentencia.setString(1, id.toString()); // Asignar el UUID como String
//	            
//	            ResultSet miResultset = miSentencia.executeQuery();
//	            
//	            if (miResultset.next()) { // Verificar si hay resultado
//	                // Crear un nuevo objeto CountryEntity y asignar los valores
//	                country = new CountryEntity();
//	                country.setId(UUIDHelper.convertToUUID(miResultset.getString("id"))); // Asignar el UUID
//	                country.setName(miResultset.getString("nombre")); // Asignar el nombre
//	            }
//	            
//	            miResultset.close();
//	        } else {
//	            System.out.println("Failed to connect to the database");
//	        }
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	    return country;
	}

	@Override
	public List<CountryEntity> findAll() {
		return findByFilter(new CountryEntity());
//		String instruccionSQL = "SELECT id, nombre FROM country";
//	    List<CountryEntity> countryList = new ArrayList<>(); // Lista para almacenar los resultados
//	    
//	    try (Connection connection = DriverManager.getConnection(url, user, password)) {
//	        if (connection != null) {
//	            Statement miSentencia = connection.createStatement();
//	            ResultSet miResultset = miSentencia.executeQuery(instruccionSQL);
//	            
//	            while (miResultset.next()) {
//	                // Crear un nuevo objeto CountryEntity y asignar los valores
//	                CountryEntity country = new CountryEntity();
//	                country.setId(UUIDHelper.convertToUUID(miResultset.getString("id")));
//	                country.setName(miResultset.getString("nombre"));
//	                
//	                // Agregar el objeto a la lista
//	                countryList.add(country);
//	            }
//	            
//	            miResultset.close();
//	        } else {
//	            System.out.println("Failed to connect to the database");
//	        }
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	    
//	    // Retornar la lista de CountryEntity
//	    return countryList;
	}

	@Override
	public List<CountryEntity> findByFilter(final CountryEntity filter) {
		final var statement = new StringBuilder();
		final var parameters = new ArrayList<>();
		final var resultSelect = new ArrayList<CountryEntity>();
		final var 
		
		// Select
		createSelect(statement);
		
		// From
		createFrom(statement);
		
		// Where
		createWhere(statement, filter, parameters);
		
		// Order By
		createOrderBy(statement);
		
		try (final var preparedStatement = getConnection().preparedStatement(statement.toString())){
			
			for (var arrayIndex = 0; arrayIndex < parameters.size(); arrayIndex++) {
				var statementIndex = arrayIndex + 1;
				preparedStatement.setObject(statement,parameters.get(arrayIndex));
			}
			
			try (final ResultSet result = preparedStatement.executeQuery()){
				while(result.next()) {
					var countryEntityTmp = new CountryEntity();
					countryEntityTmp.setId(UUIDHelper.convertToUUID(result.getString("id")));
					countryEntityTmp.setName(result.getString("name"));
					
					resultSelect.add(countryEntityTmp);
				}
			} catch (final SQLException exception) {
				var userMessage = "";
				var technicalMessege = "log de errores para encontrar mayores detalles del problema presentado...";
				
				throw DataUcoBetException.crear(userMessage, technicalMessege, exception);
			}
		} catch (final SQLException exception) {
			var userMessage = "";
			var technicalMessege = "log de errores para encontrar mayores detalles del problema presentado...";
			
			throw DataUcoBetException.crear(userMessage, technicalMessege, exception);
		}
		
	    return resultSelect; 
	}
	
	private void createSelect(final StringBuilder statement) {
		statement.append("SELECT id, name ");
	}
	
	private void createFrom(final StringBuilder statement) {
		statement.append("FROM country ");
	}
	
	private void createWhere(final StringBuilder statement, 
			final CountryEntity filter, 
			final List<Object> parameters) {
		if (ObjectHelper.isNull(filter)) {
			
			if (!UUIDHelper.isDefault(filter.getId())) {
				statement.append("WHERE id = ? ");
				parameters.add(filter.getId());
			}
			
			if (TextHelper.isEmpty(filter.getName())) {
				statement.append((parameters.isEmpty()) ? "WHERE " : "AND ");
				statement.append("name = ? ");
				parameters.add(filter.getName());
			}
			
		}
	}
	
	private void createOrderBy(final StringBuilder statement) {
		statement.append("ORDER BY name ASC");
	}
//	public static void main(String[] args) {
//		PrintStream consola = System.out;
////		// Crear una instancia de la clase donde está el método findAll()
////        CountrySqlServerDAO countryService = new CountrySqlServerDAO();
////
////        // Llamar a findAll() para obtener la lista de CountryEntity
////        List<CountryEntity> countries = countryService.findAll();
////
////        // Verificar si la lista no está vacía y recorrerla
////        if (countries != null && !countries.isEmpty()) {
////            for (CountryEntity country : countries) {
////                // Mostrar los atributos de cada CountryEntity
////                System.out.println("ID: " + country.getId() + ", Nombre: " + country.getName());
////            }
////        } else {
////            System.out.println("No se encontraron países.");
////        }
////		CountrySqlServerDAO countryService = new CountrySqlServerDAO();
////		UUID idd = UUIDHelper.convertToUUID("3c05c270-9149-43ab-b7a8-c6bd9b9eeea0");
////		CountryEntity country = countryService.fingByID(idd);
////		consola.println(country.getName()+ country.getId());
//		
//	}

	
}
