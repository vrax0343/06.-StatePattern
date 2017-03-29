package factory.af;

public class BlueTeamInfoFactory implements AbstractTeamInfoFactory {

	@Override
	public TeamName createTeamName() {
		// TODO Auto-generated method stub
		return new BlueTeamName();
	}

	@Override
	public TeamMessage createTeamMessage() {
		// TODO Auto-generated method stub
		return new BlueTeamMessage();
	}
	
}
