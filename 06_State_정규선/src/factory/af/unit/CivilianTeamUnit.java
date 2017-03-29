package factory.af.unit;

import behavior.attack.Punch;
import behavior.movement.Walk;
import behavior.weapon.Fist;
import factory.af.AbstractTeamInfoFactory;

public class CivilianTeamUnit extends TeamUnit {
	AbstractTeamInfoFactory atf;

	public CivilianTeamUnit(AbstractTeamInfoFactory atf) {
		super();
		this.atf = atf;
		health=10;
		type="Civilian";
		
		attack = new Punch();
		movement = new Walk();
		weapon = new Fist();
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		teamMessage = atf.createTeamMessage();
		teamName	= atf.createTeamName();
	}

	
	
}
