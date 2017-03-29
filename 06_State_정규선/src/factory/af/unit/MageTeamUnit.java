package factory.af.unit;

import behavior.attack.CastFireball;
import behavior.movement.Teleport;
import behavior.weapon.Staff;
import factory.af.AbstractTeamInfoFactory;

public class MageTeamUnit extends TeamUnit {
	AbstractTeamInfoFactory atf;

	public MageTeamUnit(AbstractTeamInfoFactory atf) {
		super();
		this.atf = atf;
		type = "Mage";
		health=20;
		
		attack = new CastFireball();
		movement = new Teleport();
		weapon = new Staff();
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		teamMessage = atf.createTeamMessage();
		teamName	= atf.createTeamName();
	}

	
	
}
