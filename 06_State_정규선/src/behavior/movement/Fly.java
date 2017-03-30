package behavior.movement;

public class Fly implements MovementBehavior {
	public Fly(){}
	
	@Override
	public String getMovementType() {
		// TODO Auto-generated method stub
		return "Fly";
	}

	@Override
	public int[] move(int x1, int x2, int y1, int y2) {
		// TODO Auto-generated method stub
		x1 += x2;
		y1 += y2;
		
		return new int[] {x1,y1};
	}

}
