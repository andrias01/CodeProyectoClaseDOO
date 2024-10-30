package co.edu.uco.ucobet.businesslogic.usecase.country.impl;


import co.edu.uco.crosscutting.helpers.ObjectHelper;

import co.edu.uco.ucobet.businesslogic.adapter.entity.CityEntityAdapter;
import co.edu.uco.ucobet.businesslogic.adapter.entity.CountryEntityAdapter;
import co.edu.uco.ucobet.businesslogic.usecase.city.UpdateCity;
import co.edu.uco.ucobet.businesslogic.usecase.country.UpdateCountry;
import co.edu.uco.ucobet.crosscutting.exceptions.BusinessLogicUcoBetException;
import co.edu.uco.ucobet.data.dao.DAOFactory;
import co.edu.uco.ucobet.domain.CityDomain;
import co.edu.uco.ucobet.domain.CountryDomain;

public final class UpdateCountryImpl implements UpdateCountry{
	
	private DAOFactory daoFactory;
	
	public UpdateCountryImpl(DAOFactory daoFactory) {
		setDaoFactory(daoFactory);
	}

	private void setDaoFactory(final DAOFactory daoFactory) {
		if (ObjectHelper.isNull(daoFactory)) {
			var userMessage = "Se ha presentado un problema inesperado, tratando de llevar a cabo la modificación de la información de la ciudad deseada. Por favor intente de nuevo y si el problema persiste, llame a Luz Mery Rios Alzate...";
			var technicalMessage = "El DAO factory requerido para crear la clase que actualiza la ciudad llegó nula...";
			throw BusinessLogicUcoBetException.create(userMessage, technicalMessage);
		}
		this.daoFactory = daoFactory;
	}

	@Override
	public void execute(CountryDomain data) {
		var cityEntity = CountryEntityAdapter.getCountryEntityAdapter().adaptSource(data);
		daoFactory.getCountryDAO();
		//daoFactory.getCityDAO().update(cityEntity);
		//validate Policies
	}

}
