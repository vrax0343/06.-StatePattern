package state.main;

import java.util.ArrayList;
import java.util.Iterator;

import state.NewUnit;
import unit.Unit;

public class TestDriver {
	public static void main(String[] args){
		Unit unit = Unit.getInstance();
		
		
		unit.addUnit("Citizen");
		unit.addUnit("Knight");
		unit.addUnit("Mage");
		unit.addUnit("Citizen");
//		unit.printAllUnit();
		NewUnit newUnit = new NewUnit(unit);
		ArrayList<NewUnit> newUnitList = newUnit.addNewUnit(unit);
		for(int i=0; i<newUnitList.size();i++){
			System.out.println(newUnitList.get(i).toString());
		}
		
		newUnitList.get(1).setHealth(50);
		newUnitList.get(0).setHealth(1);
		newUnitList.get(2).setHealth(18);
		
		newUnitList.get(1).attack();
//		newUnitList.get(1).attack();
//		newUnitList.get(1).attack();
		newUnitList.get(1).attack();
		
		System.out.println(newUnitList.get(1));
		
//		System.out.println(newUnitList.toString());
		
//		System.out.println();
//		System.out.println(unit);
	}
}
