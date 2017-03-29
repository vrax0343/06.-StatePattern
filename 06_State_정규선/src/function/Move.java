package function;

import check.MapLimitCheck;
import unit.Unit;

public class Move {
	int x=0, y=0;
	public Move() { }
	public Move(Unit u, int x, int y){
		MapLimitCheck mlc = new MapLimitCheck();
		int tempX=u.getLocationX(), tempY=u.getLocationY();
		
		tempX += x;
		tempY += y;
		
		u.setLocation(mlc.check(tempX), mlc.check(tempY));
	}
	
	public void moveLocation(Unit u,int x, int y){
		MapLimitCheck mlc = new MapLimitCheck();
		u.setLocation(mlc.check(x), mlc.check(y));
		
	}
	
}
