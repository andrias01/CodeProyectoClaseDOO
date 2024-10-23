package co.edu.uco.ucobet.businesslogic.adapter.entity;

import co.edu.uco.ucobet.businesslogic.adapter.Adapter;
import co.edu.uco.ucobet.domain.StateDomain;
import co.edu.uco.ucobet.entity.StateEntity;

public class StateEntityAdapter implements Adapter<StateEntity,StateDomain>{
	
	private static final Adapter<StateEntity,StateDomain> instance = new StateEntityAdapter();
	
	private StateEntityAdapter() {
		
	}
	
	public static Adapter<StateEntity,StateDomain> getStateEntityAdapter(){
		return instance;
	}

	@Override
	public StateEntity adaptSource(StateDomain data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StateDomain adaptTarget(StateEntity data) {
		// TODO Auto-generated method stub
		return null;
	}




}
