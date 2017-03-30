package main;

import unit.*;

import java.util.ArrayList;
import java.util.Iterator;

import behavior.weapon.*;
import decorator.SuperAttack;
import decorator.SuperMove;
import factory.af.unit.TeamUnit;
import factory.fm.*;
import function.FindUnit;
import state.MakingNewUnit;
import state.NewUnit;


public class MainTest {
	static final int KNIGHT = 0;
	static final int CITIZEN = 1; 
	static final int MAGE = 2;
	
	public static void main(String[] args){		
		
		Unit unit = Unit.getInstance();
		
		System.out.println("=======================================================");
		System.out.println("1. 중립 기사, 시민, 마법사를 생성한다");
		System.out.println("=======================================================");
		
		unit.addUnit("Knight");
		unit.addUnit("Citizen");
		unit.addUnit("Mage");
		unit.addUnit("Mage");
		
		ArrayList<NewUnit> newUnitList = new MakingNewUnit().makeNewUnitArray(unit);
		
		NewUnit knight = newUnitList.get(KNIGHT);
		NewUnit citizen = newUnitList.get(CITIZEN);
		NewUnit mage = newUnitList.get(MAGE);
		
		
		System.out.println("=======================================================");
		System.out.println("2. 기사 체력은 50, 시민 체력은 1, 마법사 체력은 18가 되었다");
		System.out.println("=======================================================");
		
		knight.setHealth(50);
		citizen.setHealth(1);
		mage.setHealth(18);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("3. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		
		knight.attack();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("4. 시민이 자기치료를 수행한디.");
		System.out.println("=======================================================");
		
		citizen.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. 마법사가 +10, +10 이동뒤 자기치료를 한다");
		System.out.println("=======================================================");
		
		mage.move(10, 10);
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. 기사와 마법사 마력이 1이되었다. ");
		System.out.println("=======================================================");
		
		knight.setMana(1);
		System.out.print("기사의 마력 ="+knight.getMana());
		
		mage.setMana(1);
		System.out.println("\t마법사의 마력 ="+mage.getMana());
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		
		knight.attack();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		knight.attack();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();
		
		
		System.out.println("=======================================================");
		System.out.println("9. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		knight.attack();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("10. 마법사가 자기치료를 한다.");
		System.out.println("=======================================================");
		
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("11. 마법사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		mage.attack();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("12. 마법사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		mage.attack();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();

	
	}
}
