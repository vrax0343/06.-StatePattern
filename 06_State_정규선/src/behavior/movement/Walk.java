package behavior.movement;

public class Walk implements MovementBehavior {
	
	public Walk() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMovementType() {
		// TODO Auto-generated method stub
		return "Walk";
	}

	@Override
	public int[] move(int x1, int x2, int y1, int y2) {
		// TODO Auto-generated method stub
		x1 += x2;
		y1 += y2;
		
		return new int[] {x1,y1};
	}

}
