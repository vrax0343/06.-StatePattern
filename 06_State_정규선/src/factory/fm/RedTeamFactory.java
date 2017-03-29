package factory.fm;

public class RedTeamFactory extends TeamFactoryStore {

	@Override
	TeamUnit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		if (item.equals("Civilian")) {
    		return new RedTeamCivilian();
		} else if (item.equals("Knight")) {
		    	return new RedTeamKnight();
		} else if (item.equals("Mage")) {
		    	return new RedTeamMage();
		} else return null;
	}


}
