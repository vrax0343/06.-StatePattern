package decorator.function;

import factory.af.unit.TeamUnit;

public class Fight {
	public void fightOnce(TeamUnit tempUnit){
		System.out.print(tempUnit.type + " \t");
		
		tempUnit.weapon.useWeapon(tempUnit.attack);
		System.out.println();
		System.out.println("hi");
	}
	
	public TeamUnit fightSuperAttack(TeamUnit tempUnit){
		for(int i=0; i<2; i++){
			if (tempUnit.health < 1){ }
			else{
				tempUnit.weapon.useWeapon(tempUnit.attack);
				tempUnit.health -= 1;
			}
		}
		
		return tempUnit;
	}
}
