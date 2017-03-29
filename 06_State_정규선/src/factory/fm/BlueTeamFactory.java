package factory.fm;

public class BlueTeamFactory extends TeamFactoryStore {

	@Override
	TeamUnit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		if (item.equals("Civilian")) {
    		return new BlueTeamCivilian();
		} else if (item.equals("Knight")) {
		    	return new BlueTeamKnight();
		} else if (item.equals("Mage")) {
		    	return new BlueTeamMage();
		} else return null;
	}


}
