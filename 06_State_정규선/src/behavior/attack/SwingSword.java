package behavior.attack;

public class SwingSword implements AttackBehavior {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("검으로 공격합니다.");
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return "SwingSword";
	}

}
