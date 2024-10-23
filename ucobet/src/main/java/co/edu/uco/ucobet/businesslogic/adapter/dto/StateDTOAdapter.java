package co.edu.uco.ucobet.businesslogic.adapter.dto;
import co.edu.uco.crosscutting.helpers.ObjectHelper;
import co.edu.uco.crosscutting.helpers.UUIDHelper;
import co.edu.uco.ucobet.businesslogic.adapter.Adapter;
import co.edu.uco.ucobet.data.dao.StateDAO;
import co.edu.uco.ucobet.domain.StateDomain;
import co.edu.uco.ucobet.dto.StateDTO;

public class StateDTOAdapter implements Adapter<StateDomain, StateDAO>{
	
	private static final Adapter<StateDomain, StateDAO> instance = new StateDTOAdapter();
	
	private StateDTOAdapter() {
		
	}
	
	public static Adapter<StateDomain, StateDAO> getStateDTOAdapter(){
		return instance;
	}

	@Override
	public StateDomain adaptSource(StateDAO data) {
		// Usar un DTO por defecto si data es nulo
				var dtoToAdapt = ObjectHelper.getDefault(data,StateDTO.create());
				
				// Convertir el DTO a Domain usando los adaptadores correspondientes (por ejemplo, para el Country)
				return StateDomain.create(
					UUIDHelper.convertToUUID(((StateDomain) dtoToAdapt).getId()), 
					dtoToAdapt.getName(),
					CountryDTOAdapter.getCountryDTOAdapter().adaptSource(dtoToAdapt.getCountry()) // Adaptar el país también
				);	
	}

	@Override
	public StateDAO adaptTarget(StateDomain data) {
		// Usar un Domain por defecto si data es nulo
				var domainToAdapt = ObjectHelper.getDefault(data, StateDomain.create(UUIDHelper.getDefault(), TextHelper.EMPTY, null));
				
				// Convertir el Domain a DTO usando los adaptadores correspondientes (por ejemplo, para el Country)
				return StateDTO.create()
					.setId(UUIDHelper.getUUIDAsString(domainToAdapt.getId()))
					.setName(domainToAdapt.getName())
					.setCountry(CountryDTOAdapter.getCountryDTOAdapter().adaptTarget(domainToAdapt.getCountry())); // Adaptar el país también
	}

}
