package observer;

import java.util.ArrayList;

import function.Detecting;
import unit.Unit;

public class UnitDisplay implements Observer, DisplayElement{
	private ArrayList<Unit> unitList;
	private int locationX,locationY,range=0;
	private UnitData unitData;
	
	public UnitDisplay() {
		// TODO Auto-generated constructor stub
	}
	
	public UnitDisplay(UnitData unitData){
		this.unitData = unitData;
		unitData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		new Detecting().detectUnit(unitList, locationX, locationY, range);
	}
	@Override
	public void update(ArrayList<Unit> unit, int locationX, int locationY, int range) {
		// TODO Auto-generated method stub
		this.unitList = unit;
		this.locationX = locationX;
		this.locationY = locationY;
		this.range=range;
		display();
		
	}

}
