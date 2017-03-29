package observer;

import java.util.ArrayList;

import unit.Unit;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	void notifyObservers(ArrayList<Unit> unit, int locationX, int locationY, int range);
}
