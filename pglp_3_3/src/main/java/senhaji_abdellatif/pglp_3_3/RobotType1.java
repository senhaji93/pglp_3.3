package senhaji_abdellatif.pglp_3_3;


public class RobotType1 extends Robot {
	@Override
	
	public void avance() {
		switch (direction) {
		case Nord :
			position.y++;
		break;
		case Sud :
			position.y--;
		break;
		case Ouest :
			position.x--;
		break;
		case Est :
			position.x++;
		break;
		default :
		break;
		}
	}
}
