package factory.fm;

import behavior.attack.SwingSword;
import behavior.movement.Walk;
import behavior.weapon.Sword;

public class RedTeamKnight extends TeamUnit {

	public RedTeamKnight() {
		// TODO Auto-generated constructor stub
		type = "Knight";
		health = 30;
		
		attack = new SwingSword();
		movement = new Walk();
		weapon = new Sword();
	}
	
	public String toString(){
		return "---- RedTeam " + type + " ----\n" + super.toString();
	}
}
