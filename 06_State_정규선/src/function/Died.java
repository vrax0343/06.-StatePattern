package function;

import java.util.ArrayList;
import java.util.Iterator;

import unit.Unit;

public class Died {
	ArrayList<Unit> unitList=null;
	Iterator<Unit> iterator = null;
//	public Died() { }
	public Died(ArrayList<Unit> unitList){ 
		this.unitList = unitList;
		this.iterator = unitList.iterator();
	}
	
	public void diedOne(String type){
		boolean result = false;
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			String tempType = tempUnit.getType();
			
			if(tempType.contains(type)){
				System.out.println(tempType + "이 죽었습니다.");
				iterator.remove();
				result=true;
				return;
			}
			
		}
		if (result==false)
			System.out.println("삭제 실패");
	}
	public void diedAll() {
		// TODO Auto-generated method stub
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			String tempType = tempUnit.getType();
			System.out.println(tempType + "이 죽었습니다.");
			iterator.remove();
		}
	}
	
}
