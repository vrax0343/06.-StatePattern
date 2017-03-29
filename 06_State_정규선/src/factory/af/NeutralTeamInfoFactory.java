package factory.af;

public class NeutralTeamInfoFactory implements AbstractTeamInfoFactory {

	@Override
	public TeamName createTeamName() {
		// TODO Auto-generated method stub
		return new NeutralTeamName();
	}

	@Override
	public TeamMessage createTeamMessage() {
		// TODO Auto-generated method stub
		return new NeutralTeamMessage();
	}
	
}
