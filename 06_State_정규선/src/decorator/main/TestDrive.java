package decorator.main;

import decorator.*;
import factory.af.unit.TeamUnit;

public class TestDrive {
	public static void main(String args[]) {
		TeamUnit unit = new KnightUnit();
		System.out.println(unit.getHealth());
//		unit.attack();
//		unit = new SuperAttack(unit);
//		unit.attack();
//		unit = new SuperMove(unit);
//		unit.move(200, 100);
		
		unit = new SuperAttack(unit);
		unit = new SuperMove(unit);

		unit =unit.attack();
		unit.move(100, 100);
		
//		
//		TeamUnit unit2 = new KnightUnit();
//		unit2.attack();
//		unit2.move(1, 1);
//
//		TeamUnit unit3 = new KnightUnit();
//		unit3 = new SuperAttack(unit3);
//		unit3.attack();
//		unit3.move(1, 1);
//		
//		TeamUnit unit4 = new KnightUnit();
//		unit4 = new SuperMove(unit4);
//		unit4.attack();
//		unit4.move(1, 1);
//		
//		unit.attack.attack();
//		NormalUnit unit2 = new SuperMove();
//		
//		Beverage beverage2 = new DarkRoast();
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Whip(beverage2);
//		System.out.println(beverage2.getDescription() 
//				+ " $" + beverage2.cost());
// 
//		Beverage beverage3 = new HouseBlend();
//		beverage3 = new Soy(beverage3);
//		beverage3 = new Mocha(beverage3);
//		beverage3 = new Whip(beverage3);
//		System.out.println(beverage3.getDescription() 
//				+ " $" + beverage3.cost());
	}
}
