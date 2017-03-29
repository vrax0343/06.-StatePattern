package state;

import java.util.ArrayList;
import java.util.Iterator;

import behavior.attack.AttackBehavior;
import behavior.movement.MovementBehavior;
import behavior.weapon.WeaponBehavior;
import unit.Unit;

public class NewUnit {
	
//	ArrayList<Unit> unitList;
//	ArrayList<NewUnit> newUnitList=new ArrayList<NewUnit>();
	
	
	
	String type = "";
	int locationX=0, locationY=0;
	int health=0;
	int mana, maxmana, maxhealth=0;
	
	AttackBehavior attack = null;
	MovementBehavior movement = null;
	WeaponBehavior weapon=null;
	
	State cantSelfHeal;
	
	State state = cantSelfHeal;

	
	int attackCount,moveCount = 0;
	
	public NewUnit() {
		super();
	}
	
	public NewUnit(Unit unit) {
		super();
	}
	
	public ArrayList<NewUnit> addNewUnit(Unit unit){
		Unit tempUnit;
		ArrayList<Unit> unitList = unit.getUnitList();
		Iterator<Unit> iterator = unitList.iterator();
		ArrayList<NewUnit> newUnitList=new ArrayList<NewUnit>();
		
		while(iterator.hasNext()){
			NewUnit tempNewUnit = new NewUnit();
			tempUnit = iterator.next();
			tempNewUnit.type = tempUnit.getType();
			tempNewUnit.locationX = tempUnit.getLocationX();
			tempNewUnit.locationY = tempUnit.getLocationY();
			tempNewUnit.health = tempUnit.getHealth();
			tempNewUnit.attack = tempUnit.getAttackBehavior();
			tempNewUnit.movement = tempUnit.getMovementBehavior();
			tempNewUnit.weapon = tempUnit.getWeaponBehavior();
			
			tempNewUnit.maxhealth = tempUnit.getHealth() * 2;
			tempNewUnit.maxmana = tempNewUnit.maxhealth;
			tempNewUnit.mana = tempNewUnit.maxhealth;
//			this.cantSelfHeal = new CantSelfHeal(this);
			newUnitList.add(tempNewUnit);
		}
		return newUnitList;
	}
	
	public void cantSelfHeal(){
		state.gainHealth();
	}

	
	public void attack(){
		this.attackCount+=1;
		if(this.attackCount >= 3) {
			this.attackCount = 0;
			this.health +=1;
		}
		this.attack.attack();
	}
	
	@Override
	public String toString() {
		return "NewUnit [type=" + type + ", locationX=" + locationX + ", locationY=" + locationY + ", health=" + health
				+ ", mana=" + mana + ", maxmana=" + maxmana + ", maxhealth=" + maxhealth + ", attack=" + attack
				+ ", movement=" + movement + ", weapon=" + weapon + ", cantSelfHeal=" + cantSelfHeal + ", state="
				+ state + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getMaxmana() {
		return maxmana;
	}

	public void setMaxmana(int maxmana) {
		this.maxmana = maxmana;
	}

	public int getMaxhealth() {
		return maxhealth;
	}

	public void setMaxhealth(int maxhealth) {
		this.maxhealth = maxhealth;
	}

	public AttackBehavior getAttack() {
		return attack;
	}

	public void setAttack(AttackBehavior attack) {
		this.attack = attack;
	}

	public MovementBehavior getMovement() {
		return movement;
	}

	public void setMovement(MovementBehavior movement) {
		this.movement = movement;
	}

	public WeaponBehavior getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}

	public State getCantSelfHeal() {
		return cantSelfHeal;
	}

	public void setCantSelfHeal(State cantSelfHeal) {
		this.cantSelfHeal = cantSelfHeal;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	
	
	
	
	

	
	
	
}
