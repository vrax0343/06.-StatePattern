package factory.af;

import factory.af.unit.*;

public class NeutralTeamFactory extends TeamFactoryStore {

	@Override
	public TeamUnit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		TeamUnit teamUnit = null;
		AbstractTeamInfoFactory atf = new NeutralTeamInfoFactory();
		
		if (item.equals("Mage")) {
			teamUnit = new MageTeamUnit(atf);
			teamUnit.setName("중립 법사");

		}else if (item.equals("Civilian")) {
			teamUnit = new CivilianTeamUnit(atf);
			teamUnit.setName("중립 시민");
		}else if (item.equals("Knight")) {
			teamUnit = new KnightTeamUnit(atf);
			teamUnit.setName("중립 기사");
		}

		return teamUnit;
	}

}
