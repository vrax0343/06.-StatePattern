package factory.af.unit;

import behavior.attack.SwingSword;
import behavior.movement.Walk;
import behavior.weapon.Sword;
import factory.af.AbstractTeamInfoFactory;

public class KnightTeamUnit extends TeamUnit {
	AbstractTeamInfoFactory atf;

	public KnightTeamUnit(AbstractTeamInfoFactory atf) {
		super();
		this.atf = atf;
		type = "Knight";
		health = 30;
		
		attack = new SwingSword();
		movement = new Walk();
		weapon = new Sword();
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		teamMessage = atf.createTeamMessage();
		teamName	= atf.createTeamName();
	}

	
	
}
