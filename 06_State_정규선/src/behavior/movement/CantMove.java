package behavior.movement;

public class CantMove implements MovementBehavior {


	@Override
	public int[] move(int x1, int x2, int y1, int y2) {
		// TODO Auto-generated method stub
		System.out.println("공격할 수 없습니다.");
		return null;
	}

	@Override
	public String getMovementType() {
		// TODO Auto-generated method stub
		return "CantAttack";
	}

}
