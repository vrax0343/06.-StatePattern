package decorator;

import decorator.function.Fight;
import factory.af.unit.TeamUnit;

public class SuperAttack extends AbilityDecorator {
	TeamUnit teamUnit;
	public SuperAttack(TeamUnit unit){
		this.teamUnit=unit;
		System.out.println(teamUnit.teamName +" "+teamUnit.getName() + "이(가) 각성 공격을 했습니다");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "각성공격을 합니다";
	}
	
	public TeamUnit attack(){
		System.out.println("각성 공격을 합니다.");
		System.out.println("현재 체력은: "+teamUnit.getHealth());
		System.out.println("-----------------------------");
		new Fight().fightSuperAttack(teamUnit);
		System.out.println("-----------------------------");
		System.out.println("공격 후 체력은: "+teamUnit.getHealth());
		return teamUnit;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
	
	public void move(int x, int y){
		teamUnit.move(x, y);
	}

}
