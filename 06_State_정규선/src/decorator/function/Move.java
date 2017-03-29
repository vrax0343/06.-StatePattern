package decorator.function;

import check.MapLimitCheck;
import factory.af.unit.TeamUnit;

public class Move {
	public void moveOnce(TeamUnit tempUnit,int locX, int locY){
		int x, y=0;
		System.out.print("일반 이동을 합니다.");
		System.out.print("이동전: ("+tempUnit.getLocationX()+","+tempUnit.getLocationY()+")");
		
		MapLimitCheck mlc = new MapLimitCheck();
		x=mlc.check(locX);
		y=mlc.check(locY);
		if((x!=locX) || (y!=locY)){
			System.out.println("맵 최대 크기로 인해 수정된 목표는: ("+x+","+y+")"+"입니다.");
		}
		
		tempUnit.setLocationX(x);
		tempUnit.setLocationY(y);
		
		System.out.println("\t이동후: ("+tempUnit.getLocationX()+","+tempUnit.getLocationY()+")");
//		System.out.println("hi");
	}
	
	public TeamUnit moveSuperMove(TeamUnit unit,int locX, int locY){
		MapLimitCheck mlc = new MapLimitCheck();
		int x=mlc.check(locX);
		int y=mlc.check(locY);
		if(x!=locX || y!=locY)
			System.out.println("맵 최대 크기로 인해 수정된 목표는: ("+locX+","+locY+")"+"입니다.");
		else
			System.out.println("목표지점은: ("+locX+","+locY+")"+"입니다.");
		while(true){
			if((unit.health <1) || ((locX==unit.locationX)&&(locY==unit.locationY))){
				System.out.println("체력이 부족하여 이동할 수 없습니다.");
				break;
			} 
			
			if(locX < unit.locationX) unit.locationX-=2;
			else if(locX > unit.locationX) unit.locationX+=2;
			else if(locY > unit.locationY) unit.locationY+=2;
			else if(locY < unit.locationY) unit.locationY-=2;
			unit.health -=1;
		}
		
		return unit;
	}
	
//	public NormalUnit moveOnce(NormalUnit tempUnit){
//		if (tempUnit.health < 1){ }
//		else{
//			Move move = new Move();
//			move.movee(tempUnit);
//		}
//		
//		return tempUnit;
//	}
}
