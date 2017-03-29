package factory.af.unit;

import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import decorator.function.Fight;
import factory.af.TeamInfo;
import factory.af.TeamMessage;
import factory.af.TeamName;
import function.GenerateRandomPosition;

public abstract class TeamUnit {
	public TeamInfo teamInfo;
	String name;
	public TeamMessage teamMessage;
	public TeamName teamName;
	
	public AttackBehavior attack = null;
	public MovementBehavior movement = null;
	public WeaponBehavior weapon=null;
	
	public String type="";
	public int locationX=GenerateRandomPosition.generate(), locationY=GenerateRandomPosition.generate();
	public int health=0;
	
	Fight fight = new Fight();
	
	public abstract void prepare();
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}

	public void createTeamInfo() {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println(("location: ("+locationX+","+locationY+ ")"));
		System.out.println(("health: "+health + "\n"));
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	
	public int getHealth(){
		return this.health;
	}
	public TeamUnit attack(){ 
		return null;
	}
	
	public void move(int x,int y){
		new decorator.function.Move().moveOnce(this, x, y);
	}
	
	
}
