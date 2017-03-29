package factory.fm;

import behavior.attack.SwingSword;
import behavior.movement.Walk;
import behavior.weapon.Sword;

public class BlueTeamKnight extends TeamUnit {

	public BlueTeamKnight() {
		// TODO Auto-generated constructor stub
		type = "Knight";
		health = 30;
		
		attack = new SwingSword();
		movement = new Walk();
		weapon = new Sword();
	}
	
	public String toString(){
		return "---- BlueTeam " + type + " ----\n" + super.toString();
	}
}
