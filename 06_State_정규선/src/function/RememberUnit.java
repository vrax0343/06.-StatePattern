package function;

import java.util.ArrayList;

import check.MapLimitCheck;
import unit.Unit;

public class RememberUnit {
	public RememberUnit() { }
	
	public ArrayList<Unit> rememberOne(ArrayList<Unit> unitList, ArrayList<Unit> detectList, String type){
		if (detectList ==null)
			detectList = new ArrayList<Unit>();
		detectList.add(new FindUnit().findOneByType(unitList, type));
		return detectList;
	}
}
