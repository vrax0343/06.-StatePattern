package decorator;

import behavior.attack.SwingSword;
import behavior.movement.Walk;
import behavior.weapon.Sword;
import factory.af.unit.TeamUnit;
import function.Move;

public class KnightUnit extends TeamUnit {
	public KnightUnit() {
		this.type = "Knight";
		this.health = 30;
		
		this.attack = new SwingSword();
		this.movement = new Walk();
		this.weapon = new Sword();
	}
	public TeamUnit attack(){ 
		System.out.println("노말 공격");
		return this;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
