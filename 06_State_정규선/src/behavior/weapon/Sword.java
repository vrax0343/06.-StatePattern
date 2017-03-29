package behavior.weapon;

import behavior.attack.AttackBehavior;

public class Sword implements WeaponBehavior {

	@Override
	public void useWeapon(AttackBehavior ab){
		// TODO Auto-generated method stub
		System.out.println("검을 사용합니다.");
		ab.attack();
	}

	@Override
	public String getWeaponType() {
		// TODO Auto-generated method stub
		return "Sword";
	}

}
