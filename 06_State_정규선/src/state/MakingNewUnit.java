package state;

import java.util.ArrayList;
import java.util.Iterator;

import unit.Unit;

public class MakingNewUnit {
	ArrayList<NewUnit> newUnitList=new ArrayList<NewUnit>();
	
	public ArrayList<NewUnit> makeNewUnitArray(Unit u){
		Unit tempUnit;
		ArrayList<Unit> unitList = u.getUnitList();
		Iterator<Unit> iterator = unitList.iterator();
//		ArrayList<NewUnit> newUnitList=new ArrayList<NewUnit>();
		
		
		
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
			
			tempNewUnit.maxHealth = tempUnit.getHealth() * 2;
			tempNewUnit.maxMana = tempNewUnit.maxHealth;
			tempNewUnit.mana = tempNewUnit.maxHealth;
			
			
//			this.cantSelfHeal = new CantSelfHeal(this);
			
			newUnitList.add(tempNewUnit);
		}
		return newUnitList;
		
		
	}
}
