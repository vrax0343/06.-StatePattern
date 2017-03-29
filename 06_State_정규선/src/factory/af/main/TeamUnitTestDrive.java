package factory.af.main;

import factory.af.*;
import factory.af.unit.TeamUnit;

public class TeamUnitTestDrive {
 
	public static void main(String[] args) {
		TeamFactoryStore blueTeamFactory = new BlueTeamFactory();
		TeamFactoryStore redTeamFactory = new RedTeamFactory();
		TeamUnit blueUnit,redUnit = null;
		
		blueUnit = blueTeamFactory.makeUnit("Mage");
		blueUnit = blueTeamFactory.makeUnit("Civilian");
		blueUnit = blueTeamFactory.makeUnit("Knight");
	}
}
