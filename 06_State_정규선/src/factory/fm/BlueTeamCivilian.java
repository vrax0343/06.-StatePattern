package factory.fm;

import behavior.attack.AttackBehavior;
import behavior.attack.Punch;
import behavior.movement.Walk;
import behavior.weapon.Fist;

public class BlueTeamCivilian extends TeamUnit {

	public BlueTeamCivilian() {
		// TODO Auto-generated constructor stub
		type = "Civilian";
		health=10;
		
		attack = new Punch();
		movement = new Walk();
		weapon = new Fist();
	}
	
	public String toString(){
		return "---- BlueTeam " + type + " ----\n" + super.toString();
	}
	

}
