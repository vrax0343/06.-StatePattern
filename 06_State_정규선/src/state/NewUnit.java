package state;

import java.util.ArrayList;

import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import unit.Unit;

public class NewUnit {
	
	String type = "";
	int locationX=0, locationY=0;
	int health=0;
	int mana, maxMana, maxHealth=0;
	
	AttackBehavior attack = null;
	MovementBehavior movement = null;
	WeaponBehavior weapon=null;
	
	State cantSelfHeal;
	State lessHealthHeal;
	State muchHealthHeal;
	
	State state = cantSelfHeal;
	
	int check=0;
	int[] stackCountArr = {0,0};
	
	public NewUnit() {
		super();
		cantSelfHeal = new CantSelfHeal(this);
		lessHealthHeal = new LessHealthHeal(this);
		muchHealthHeal = new MuchHealthHeal(this);

		state = cantSelfHeal;
	}
	
	public NewUnit(Unit unit) {
		super();
	}
	
	public void doSelfHeal(){
		state.selfHeal();
	}

	
	public void attack(){
		this.attack.attack();
		this.stackCountArr[0]+=1;
		stackCounterCheck();
		
	}
	public void move(int x, int y){
		System.out.println("---"+this.getType() + " is moving---");
		System.out.print("[Before]: (" + this.locationX+","+this.locationY+")");
		int[] tempIntArr=this.movement.move(this.getLocationX(),x,this.getLocationY(),y);
		this.setLocationX(tempIntArr[0]);
		this.setLocationY(tempIntArr[1]);
		System.out.println(" [After]: (" + this.locationX+","+this.locationY+")");
		this.stackCountArr[1]+=1;
		stackCounterCheck();
	}
	
	
	public void stackCounterCheck(){
		int value = this.stackCountArr[0] + this.stackCountArr[1];
		if(value >= 3) {
			int mana = this.mana;
			System.out.print("공격: "+this.stackCountArr[0] +
								"\t이동: "+this.stackCountArr[1]+
								"\t총 3회가 되었기에 마나를 1 증가시킵니다.\t");
			this.stackCountArr = new int[] {0,0};
			this.mana +=1;
			if(this.state instanceof CantSelfHeal){
				if(this.health < 50) this.state = new LessHealthHeal(this);
				else this.state=new MuchHealthHeal(this);
			}
			System.out.println("["+mana+" -> "+this.mana+"]");
			
		}else {
			
		}
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "NewUnit [type=" + type + ", locationX=" + locationX + ", locationY=" + locationY + ", health=" + health
				+ ", mana=" + mana + ", maxMana=" + maxMana + ", maxHealth=" + maxHealth + ", attack=" + attack
				+ ", movement=" + movement + ", weapon=" + weapon + ", cantSelfHeal=" + cantSelfHeal + ", state="
				+ state + "]";
	}

	
	
	
	
	
	
	
	
	
	//getter
	
	public String getType() {
		return type;
	}
	public int getLocationX() {
		return locationX;
	}
	public int getLocationY() {
		return locationY;
	}
	public int getHealth() {
		return health;
	}
	public int getMana() {
		return mana;
	}
	public int getmaxMana() {
		return maxMana;
	}
	public int getmaxHealth() {
		return maxHealth;
	}
	public AttackBehavior getAttack() {
		return attack;
	}
	public MovementBehavior getMovement() {
		return movement;
	}
	public WeaponBehavior getWeapon() {
		return weapon;
	}
	public State getCantSelfHeal() {
		return cantSelfHeal;
	}
	public State getLessHealthHeal() {
		return lessHealthHeal;
	}
	public State getMuchHealthHeal() {
		return muchHealthHeal;
	}
	public State getState() {
		return state;
	}
	
	//setter
	public void setType(String type) {
		this.type = type;
	}
	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}
	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}
	public void setHealth(int health,int value) {
		System.out.println("+"+this.getType() + " 에 체력을  '"+value+"' 더합니다");
		System.out.print("[Before]: " + this.health);
		if (health > this.maxHealth) 
			this.health = this.maxHealth;
		else 
			this.health = health;
		System.out.println("\t[After]: " + this.health);
	}
	public void setHealth(int health) {
		System.out.println("---"+this.getType() + " 의 체력을 수정합니다---");
		System.out.print("[Before]: " + this.health);
		if (health > this.maxHealth) 
			this.health = this.maxHealth;
		else 
			this.health = health;
		System.out.println("\t[After]: " + this.health);
	}
	public void setMana(int mana) {
		if (mana > this.maxMana) 
			this.mana = this.maxMana;
		else 
			this.mana = mana;
	}
	public void setmaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
	public void setmaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	public void setAttack(AttackBehavior attack) {
		this.attack = attack;
	}
	public void setMovement(MovementBehavior movement) {
		this.movement = movement;
	}
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	public void setCantSelfHeal(State cantSelfHeal) {
		this.cantSelfHeal = cantSelfHeal;
	}
	public void setState(State state) {
		this.state = state;
	}

	


	
	
	
	
	

	
	
	
}
