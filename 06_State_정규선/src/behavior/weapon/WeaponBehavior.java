package behavior.weapon;

import behavior.attack.AttackBehavior;

public interface WeaponBehavior {
	public void useWeapon(AttackBehavior ab);
	public String getWeaponType();
}
