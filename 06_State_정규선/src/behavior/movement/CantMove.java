package behavior.movement;

public class CantMove implements MovementBehavior {


	@Override
	public int[] move(int x1, int x2, int y1, int y2) {
		// TODO Auto-generated method stub
		System.out.println("������ �� �����ϴ�.");
		return null;
	}

	@Override
	public String getMovementType() {
		// TODO Auto-generated method stub
		return "CantAttack";
	}

}
