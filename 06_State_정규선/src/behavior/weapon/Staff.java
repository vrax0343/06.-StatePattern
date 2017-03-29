package behavior.weapon;

import behavior.attack.AttackBehavior;

public class Staff implements WeaponBehavior {

	@Override
	public void useWeapon(AttackBehavior ab){
		// TODO Auto-generated method stub
		System.out.println("스태프를 사용합니다.");
		ab.attack();
	}

	@Override
	public String getWeaponType() {
		// TODO Auto-generated method stub
		return "Staff";
	}

}
