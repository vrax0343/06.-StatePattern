package function;

import java.util.ArrayList;
import java.util.Iterator;

import check.MapLimitCheck;
import unit.Unit;

public class FindUnit {
	int x=0, y=0;
	
	public FindUnit() { }
	public FindUnit(Unit u, int x, int y){
		MapLimitCheck mlc = new MapLimitCheck();
		int tempX=u.getLocationX(), tempY=u.getLocationY();
		
		tempX += x;
		tempY += y;
		
		u.setLocation(mlc.check(tempX), mlc.check(tempY));
	}
	
	public Unit findOneByType(ArrayList<Unit> unitList,String type){
		Iterator<Unit> iterator = unitList.iterator();
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			String tempType = tempUnit.getType();
			if(tempType.contains(type))
				return tempUnit;
		}
		return null;
	}
	public Unit findByIndex(ArrayList<Unit> unitList,int index){
		if(index < 0 || index > unitList.size()) return null;
		return unitList.get(index);
	}	
}
