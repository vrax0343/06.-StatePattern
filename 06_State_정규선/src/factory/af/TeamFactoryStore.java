package factory.af;

import behavior.attack.CantAttack;
import behavior.attack.CastFireball;
import behavior.attack.Punch;
import behavior.attack.SwingSword;
import behavior.movement.Fly;
import behavior.movement.Teleport;
import behavior.movement.Walk;
import behavior.weapon.Fist;
import behavior.weapon.NoWeapon;
import behavior.weapon.Staff;
import behavior.weapon.Sword;
import factory.af.unit.TeamUnit;
import function.GenerateRandomPosition;

public abstract class TeamFactoryStore {
	
	public abstract TeamUnit createTeamUnit(String type);
	
	public TeamUnit makeUnit(String type) {
		TeamUnit tempUnit = createTeamUnit(type);
		System.out.println("--- Making a " + tempUnit.getName() + " ---");
		tempUnit.prepare();
		tempUnit.print();
		return tempUnit; 
	}
}
