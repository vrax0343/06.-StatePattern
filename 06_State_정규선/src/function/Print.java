package function;

import java.util.ArrayList;
import java.util.Iterator;

import unit.Unit;

public class Print {
	ArrayList<Unit> unitList=null;
	Iterator<Unit> iterator = null;
//	public Print() { }
	public Print(ArrayList<Unit> unitList){ 
		iterator = unitList.iterator();
	}
	
	public void printOne(String type){
		boolean result = false;
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			String tempType = tempUnit.getType();
			
			if(tempType.contains(type)){
				System.out.println(tempUnit.toString());
				result=true;
				return;
			}
			
		}
		if (result==false)
			System.out.println("출력 실패");
	}
	public void printAll() {
		// TODO Auto-generated method stub
		int i = 1;
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			System.out.println("---"+i+"번째 유닛은 " + tempUnit.getType()+"입니다.---");
			System.out.print("Type: "+tempUnit.getType() + "\t"+
					"Health: " + tempUnit.getHealth() + "\t"+
					"Location X,Y: " + tempUnit.getLocationX()+","+tempUnit.getLocationY()+"\t"+
					"WeaponType: " + tempUnit.getWeaponType() + "\t"+
					"MovementType: " + tempUnit.getMovementType() + "\t"+
					"AttackType: " + tempUnit.getAttackType() + "\n");
			
			i++;
		}
		if(i==1)
			System.out.println("현재 유닛이 존재하지 않습니다.");
	}
}
