package state;

public class CantSelfHeal implements State {
	NewUnit nu;
	
	public CantSelfHeal(NewUnit nu) {
		super();
		this.nu = nu;
	}

	@Override
	public void gainHealth() {
		// TODO Auto-generated method stub
		System.out.println("자힐불가/체력증가");
	}

	@Override
	public void gainMana() {
		// TODO Auto-generated method stub
		System.out.println("자힐불가/마나증가");
	}

	@Override
	public void loseMana() {
		// TODO Auto-generated method stub
		System.out.println("자힐불가/마나감소");
	}

}
