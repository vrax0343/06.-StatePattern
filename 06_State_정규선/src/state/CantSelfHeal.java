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
		System.out.println("�����Ұ�/ü������");
	}

	@Override
	public void gainMana() {
		// TODO Auto-generated method stub
		System.out.println("�����Ұ�/��������");
	}

	@Override
	public void loseMana() {
		// TODO Auto-generated method stub
		System.out.println("�����Ұ�/��������");
	}

}
