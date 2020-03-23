package senhaji_abdellatif.pglp_3_3;

import java.util.ArrayList;


public final class App {
	
	private App() {
	}
	
	public static void avancerTous(final ArrayList<Robot> r) {
		for (Robot robot : r) {
			robot.avance();
		}
	}
	
    public static void main(final String[] args) {
    	ArrayList<Robot> r = new ArrayList<Robot>();
        r.add(new RobotType1());
        r.add(new RobotType2(10));
        avancerTous(r);
        for (Robot robot : r) {
			System.out.println(robot.position.toString());
		}
    }
}

