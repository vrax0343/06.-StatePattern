package factory.fm;

import behavior.attack.CastFireball;
import behavior.movement.Teleport;
import behavior.weapon.Staff;

public class BlueTeamMage extends TeamUnit {

	public BlueTeamMage() {
		// TODO Auto-generated constructor stub
		type = "Mage";
		health=20;
		
		attack = new CastFireball();
		movement = new Teleport();
		weapon = new Staff();
	}
	
	public String toString(){
		return "---- BlueTeam " + type + " ----\n" + super.toString();
	}
}
