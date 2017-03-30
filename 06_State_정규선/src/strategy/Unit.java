package strategy;

import function.GenerateRandomPosition;
import function.Move;
import behavior.movement.*;
import behavior.weapon.*;
//import behavior.attack.*;
import behavior.attack.AttackBehavior;

public abstract class Unit {
	AttackBehavior attack = null;
	MovementBehavior movement = null;
	WeaponBehavior weapon=null;
	
	String type = "";
	int locationX=0, locationY=0;
	int health=0;
	
	public Unit() { }
	Unit(String type){
		this.type=type;
		this.locationX=GenerateRandomPosition.generate();
		this.locationY=GenerateRandomPosition.generate();
	}
	
	
	
	public Unit(AttackBehavior attack, MovementBehavior movement, WeaponBehavior weapon, String type, int locationX,
			int locationY, int health) {
		super();
		this.attack = attack;
		this.movement = movement;
		this.weapon = weapon;
		this.type = type;
		this.locationX = locationX;
		this.locationY = locationY;
		this.health = health;
	}
	public abstract void fight();
	
	
	public void move(int x, int y){
//		new Move(this, x, y);
	}
	
	
	//getter
	public String getType(){
		return this.type;
	}
	public void getLocation(){
		System.out.println("("+this.locationX+"," + this.locationY+")");
	}
	public int getLocationX(){
		return this.locationX;
	}
	public int getLocationY(){
		return this.locationY;
	}
	public String getWeaponType(){
		return this.weapon.getWeaponType();
	}	
	public String getAttackType(){
		return this.attack.getAttackType();
	}
	
	
	//setter
	public void setWeapon(WeaponBehavior w){
		System.out.print("[Before Weapon]: " + this.getWeaponType() +"\t");
		this.weapon = w;
		System.out.println("[After Weapon]: " + this.getWeaponType());
	}
	public void setMovement(MovementBehavior m){
		this.movement = m;
	}
	public void setAttack(AttackBehavior a){
		System.out.print("[Before Attack]: " + this.getAttackType() +"\t");
		this.attack = a;
		System.out.println("[After Attack]: " + this.getAttackType());
	}
	
	public void setLocation(int x, int y){
		System.out.print("[Before Location]: (" + this.getLocationX()+","+this.getLocationY()+")\t");
		this.locationX = x;
		this.locationY = y;
		System.out.println("[After Location]: (" + this.getLocationX()+","+this.getLocationY()+")");
		System.out.println();
	}
	
	
	//toString
	public String toString(){
		return "---현재 "+this.type+"의 상태입니다---" + "\n"+ 
				"Type: " + this.type + "\t"+
				"Health: " + this.health + "\t"+
				"Location X,Y: " + this.locationX+","+this.locationY+"\t"+
				"WeaponType: " + this.weapon.getWeaponType() + "\t"+
				"MovementType: " + this.movement.getMovementType() + "\t"+
				"AttackType: " + this.attack.getAttackType() + "\t";
	}
}
