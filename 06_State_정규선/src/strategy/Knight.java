package strategy;

import behavior.attack.*;
import behavior.movement.*;
import behavior.weapon.*;

public class Knight extends Unit {
	public Knight() {
		// TODO Auto-generated constructor stub
		super("Knight");
		this.health = 30;
		this.weapon = new Sword();
		this.movement = new Walk();
		this.attack = new SwingSword();
}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.print("±â»ç°¡\t ");
		weapon.useWeapon(this.attack);
		System.out.println();
	}

}
