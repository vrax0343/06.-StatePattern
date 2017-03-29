package decorator;

import behavior.attack.CastFireball;
import behavior.movement.Teleport;
import behavior.weapon.Staff;
import factory.af.unit.TeamUnit;

public class MageUnit extends TeamUnit {
	public MageUnit(){
		health=20;
		type="Mage";
		
		attack = new CastFireball();
		movement = new Teleport();
		weapon = new Staff();
	}
	public TeamUnit attack(){ 
		System.out.println("노말 공격");
		return this;
	}
	public void move(){
		System.out.println("노말 이동");
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
