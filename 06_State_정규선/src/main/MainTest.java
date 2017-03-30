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
		System.out.println("1. �߸� ���, �ù�, �����縦 �����Ѵ�");
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
		System.out.println("2. ��� ü���� 50, �ù� ü���� 1, ������ ü���� 18�� �Ǿ���");
		System.out.println("=======================================================");
		
		knight.setHealth(50);
		citizen.setHealth(1);
		mage.setHealth(18);
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("3. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		
		knight.attack();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("4. �ù��� �ڱ�ġ�Ḧ �����ѵ�.");
		System.out.println("=======================================================");
		
		citizen.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. �����簡 +10, +10 �̵��� �ڱ�ġ�Ḧ �Ѵ�");
		System.out.println("=======================================================");
		
		mage.move(10, 10);
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. ���� ������ ������ 1�̵Ǿ���. ");
		System.out.println("=======================================================");
		
		knight.setMana(1);
		System.out.print("����� ���� ="+knight.getMana());
		
		mage.setMana(1);
		System.out.println("\t�������� ���� ="+mage.getMana());
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		
		knight.attack();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		knight.attack();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();
		
		
		System.out.println("=======================================================");
		System.out.println("9. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		knight.attack();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("10. �����簡 �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("11. �����簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		mage.attack();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("12. �����簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		mage.attack();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();

	
	}
}
