package factory.fm;


import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import function.GenerateRandomPosition;

public abstract class TeamUnit {
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	
	public String type="";
	public int locationX=GenerateRandomPosition.generate(), locationY=GenerateRandomPosition.generate();
	public int health=0;
	
	@Override
	public String toString() { 
		StringBuffer display = new StringBuffer();
		display.append("location: ("+locationX+","+locationY+ ")\n");
		display.append("health: "+health + "\n");
		return display.toString();
	}
	
	
}
