package decorator;

import decorator.function.Move;
import factory.af.unit.TeamUnit;

public class SuperMove extends AbilityDecorator {
	TeamUnit teamUnit;
	public SuperMove(TeamUnit unit){
		this.teamUnit=unit;
		System.out.println(teamUnit.teamName +" "+teamUnit.getName() + "이(가) 각성 이동을 했습니다");
	}
	
	
	
	public void move(int locX, int locY){
		System.out.println("("+locX+","+locY+")"+"으로 각성 이동을 합니다.");
		System.out.println("현재 체력은: "+teamUnit.getHealth());
		System.out.println("현재 위치는: ("+teamUnit.locationX+","+teamUnit.locationY+")");
		
		System.out.println("-----------------------------");
		teamUnit=new Move().moveSuperMove(teamUnit, locX, locY);
		System.out.println("-----------------------------");
		System.out.println("이동 후 체력은: "+teamUnit.getHealth());
		System.out.println("이동 후 위치는: ("+teamUnit.locationX+","+teamUnit.locationY+")");
		
//		unit.attack(unit);
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TeamUnit attack() {
		// TODO Auto-generated method stub
		teamUnit.attack();
		return teamUnit;
	}



	
}
