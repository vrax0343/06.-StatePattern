package state.main;

import java.util.ArrayList;
import java.util.Iterator;

import state.MakingNewUnit;
import state.MuchHealthHeal;
import state.NewUnit;
import unit.Unit;

public class TestDriver {
	static final int CITIZEN = 0; 
	static final int KNIGHT = 1;
	static final int MAGE = 2;
	
	public static void main(String[] args){
//		static final int 
		Unit unit = Unit.getInstance();
		
		
		unit.addUnit("Citizen");
		unit.addUnit("Knight");
		unit.addUnit("Mage");
		unit.addUnit("Citizen");
//		unit.printAllUnit();
//		NewUnit newUnit = new NewUnit(unit);
		
		ArrayList<NewUnit> newUnitList = new MakingNewUnit().makeNewUnitArray(unit);
		Iterator iter = newUnitList.iterator();
		
		NewUnit knight = newUnitList.get(KNIGHT);
//		knight.setState(new MuchHealthHeal(knight));
//		knight.setHealth(1);
		
//		newUnitList.get(KNIGHT).setHealth(50);
//		newUnitList.get(CITIZEN).setHealth(1);
//		newUnitList.get(MAGE).setHealth(18);
		
		//complete
//		newUnitList.get(KNIGHT).attack();
//		
		
		knight.doSelfHeal();
		knight.doSelfHeal();
		
		System.out.println(knight);
		knight.move(10, 10);
		System.out.println(knight);
		
//		
//		while(iter.hasNext()){
//			System.out.println(iter.next().toString());
//		}
//		
		
//		System.out.println();
//		System.out.println(unit);
	}
}
