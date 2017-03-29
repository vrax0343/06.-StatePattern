package factory.af;

import factory.af.unit.*;

public class BlueTeamFactory extends TeamFactoryStore {

	@Override
	public TeamUnit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		TeamUnit teamUnit = null;
		AbstractTeamInfoFactory atf = new BlueTeamInfoFactory();
		
		if (item.equals("Mage")) {
			teamUnit = new MageTeamUnit(atf);
			teamUnit.setName("블루 법사");

		}else if (item.equals("Civilian")) {
			teamUnit = new CivilianTeamUnit(atf);
			teamUnit.setName("블루 시민");
		}else if (item.equals("Knight")) {
			teamUnit = new KnightTeamUnit(atf);
			teamUnit.setName("블루 기사");
		}

		return teamUnit;
	}

}
