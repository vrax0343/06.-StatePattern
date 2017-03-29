package observer;

import java.util.ArrayList;

import unit.Unit;

public interface Observer {
	public void update(ArrayList<Unit> unit, int locationX, int locationY, int range);
}
