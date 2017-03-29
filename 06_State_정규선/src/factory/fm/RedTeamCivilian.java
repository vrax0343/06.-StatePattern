package factory.fm;

import behavior.attack.Punch;
import behavior.movement.Walk;
import behavior.weapon.Fist;

public class RedTeamCivilian extends TeamUnit {

	public RedTeamCivilian() {
		// TODO Auto-generated constructor stub
		type = "Civilian";
		health=10;
		
		attack = new Punch();
		movement = new Walk();
		weapon = new Fist();
	}
	
	public String toString(){
		return "---- RedTeam " + type + " ----\n" + super.toString();
	}
}
