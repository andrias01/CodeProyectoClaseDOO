package co.edu.uco.ucobet.data.dao;

import co.edu.uco.ucobet.data.dao.enums.DAOsource;

public abstract class DAOFactory {
	
	public final static DAOFactory getFactory(final DAOsource source) {
		return null;
	}
	protected abstract void openConnection();

	public abstract void initTransaction();
	
	public abstract void commitTransaction();
	
	public abstract void rollbackTransaction();
	
	public abstract void closeConnection();
	
	public abstract CityDAO getCityDAO();
	public abstract CountryDAO getCountryDAO();
	public abstract StateDAO getStateDAO();
}