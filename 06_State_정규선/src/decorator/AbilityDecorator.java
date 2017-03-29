package decorator;

import factory.af.unit.TeamUnit;

public abstract class AbilityDecorator extends TeamUnit {
	public TeamUnit teamUnit;
	
	public abstract String getDescription();
	
	public void setUnit(TeamUnit nu){
		this.teamUnit = nu;
	}
	
	public TeamUnit getUnit(){
		return teamUnit;
	}
}
