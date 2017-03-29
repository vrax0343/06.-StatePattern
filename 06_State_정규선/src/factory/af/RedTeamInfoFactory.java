package factory.af;

public class RedTeamInfoFactory implements AbstractTeamInfoFactory {
	@Override
	public TeamName createTeamName() {
		// TODO Auto-generated method stub
		return new RedTeamName();
	}

	@Override
	public TeamMessage createTeamMessage() {
		// TODO Auto-generated method stub
		return new RedTeamMessage();
	}
}
