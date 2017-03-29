package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import check.MapLimitCheck;
import unit.Unit;

public class Detecting {
	final static int POSITIVEX=0;
	final static int NEGATIVEX=1;
	final static int POSITIVEY=2;
	final static int NEGATIVEY=3;
	
	Unit u = null;
	int x,y,range=0;
	
	public Detecting() { }
	public Detecting(Unit u, int x, int y){
		this.range=20;
		this.u=u;
		this.x=x;
		this.y=y;
	}
	public Detecting(Unit u, int x, int y, int range){
		this.range=range;
		this.u=u;
		this.x=x;
		this.y=y;
		MapLimitCheck mlc = new MapLimitCheck();
		int[] intArray = {x+range,x-range,y+range,y-range};
		intArray = mlc.checkArray(intArray);
		int tempX=u.getLocationX(), tempY=u.getLocationY();
		
		tempX += x;
		tempY += y;
		
		u.setLocation(mlc.check(tempX), mlc.check(tempY));
	}
	public void detectUnit(ArrayList<Unit> detectList,int x, int y, int range){
		System.out.println("---탐지를 시작합니다.---");
		MapLimitCheck mlc = new MapLimitCheck();
		
		int[] intArray = new int[] {x+range,x-range,y+range,y-range};
		
		intArray = mlc.checkArray(intArray);
		System.out.print("탐지 범위  X:"+"("+intArray[NEGATIVEX]+","+intArray[POSITIVEX]+")");
		System.out.println("\tY:"+"("+intArray[NEGATIVEY]+","+intArray[POSITIVEY]+")");
		Iterator<Unit> iterator = detectList.iterator();
		while(iterator.hasNext()){
			Unit tempUnit = iterator.next();
			int tempX=tempUnit.getLocationX();
			int tempY=tempUnit.getLocationY();
			if((intArray[NEGATIVEX] <= tempX) && (intArray[POSITIVEX] >= tempX)){
				if((intArray[NEGATIVEY] <= tempY) && (intArray[POSITIVEY] >= tempY)){
					System.out.println(tempUnit.getType() + "은 탐지 범위 안에 있으며 현재 위치는 ("+ tempX+", "+tempY+")입니다.");
				}else
					System.out.println(tempUnit.getType() + "은 탐지 범위 밖입니다.("+ tempX+", "+tempY+")");
			}else
				System.out.println("탐지 범위에 유닛이 없습니다.");
			
		}
		
	}
}
