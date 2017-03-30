package state;

public class CantSelfHeal implements State {
	NewUnit nu;
	
	public CantSelfHeal(NewUnit nu) {
		super();
		this.nu = nu;
	}


	@Override
	public void selfHeal() {
		// TODO Auto-generated method stub
		if(nu.check==0)
			System.out.println("유닛 생성 후 최초의 자가치료는 불가능 합니다.");
		else if(nu.check==1)
			System.out.println(nu.getType() + "의 마나가 부족합니다");
		int tempHealth=nu.getHealth();
		if(tempHealth <50) 
			nu.setState(nu.getLessHealthHeal());
		else
			nu.setState(nu.getMuchHealthHeal());
		System.out.println();
	}

}
