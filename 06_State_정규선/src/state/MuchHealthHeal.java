package state;

public class MuchHealthHeal implements State{
	NewUnit nu;
	
	public MuchHealthHeal(NewUnit nu) {
		super();
		this.nu = nu;
	}

	@Override
	public void selfHeal() {
		// TODO Auto-generated method stub
		if(nu.getMana() <= 0){
			System.out.println(nu.getType() + "의 마나가 부족합니다");
			nu.setState(nu.getCantSelfHeal());
			nu.check = 1;
		} else{
			int tempMana = nu.getMana();
			nu.setHealth(nu.getHealth()+2,2);
			nu.setMana(nu.getMana()-1);
			System.out.println("남은 마나량은: ["+tempMana+" -> "+nu.getMana()+"]");
		}
		
		
		System.out.println();
	}

}
