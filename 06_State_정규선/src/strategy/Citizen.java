package strategy;

import behavior.attack.*;
import behavior.movement.*;
import behavior.weapon.*;

public class Citizen extends Unit {
	public Citizen() {
		// TODO Auto-generated constructor stub
		super("Citizen");
		this.health = 10;
		this.weapon = new Fist();
		this.movement = new Walk();
		this.attack = new Punch();
}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.print("Ω√πŒ¿Ã \t");
		weapon.useWeapon(this.attack);
		System.out.println();
	}
}
