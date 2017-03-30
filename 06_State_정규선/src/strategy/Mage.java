package strategy;

import behavior.attack.*;
import behavior.weapon.*;
import behavior.movement.*;

public class Mage extends Unit {
	public Mage() {
		// TODO Auto-generated constructor stub
		super("Mage");
		this.health = 20;
		this.weapon = new Staff();
		this.movement = new Teleport();
		this.attack = new CastFireball();
}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.print("마법사가\t ");
		weapon.useWeapon(this.attack);
		System.out.println();
	}

}
