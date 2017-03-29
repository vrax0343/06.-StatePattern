package observer;

import java.util.*;

import unit.Unit;

public class UnitData implements Subject {
	private ArrayList<Observer> observers;
//	private Unit unit;
	private ArrayList<Unit> unit;
	
	public UnitData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(observer.Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(observer.Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers(ArrayList<Unit> unit, int locationX, int locationY, int range) {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(unit,locationX,locationY,range);
		}
	}
	public void changed(ArrayList<Unit> unit, int locationX, int locationY, int range) {
		notifyObservers(unit,locationX,locationY,range);
	}
	
	public void setUnit(ArrayList<Unit> unit) {
		this.unit = unit;
	}
	
	public ArrayList<Unit> getUnit() {
		return this.unit;
	}



	
}
