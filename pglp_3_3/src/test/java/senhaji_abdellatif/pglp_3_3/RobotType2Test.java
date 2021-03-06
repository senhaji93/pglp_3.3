package senhaji_abdellatif.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * tests unitaires de la classe RobotType2
 */
public class RobotType2Test {
	@Test
	/**
	 * teste le constructeur et le getter du robot
	 */
	public void test() {
		Robot r = new RobotType2(4);
		assertTrue(r.getPosition().x == r.getPosition().y && r.getPosition().y == 0);
	}
	@Test
	/**
	 * teste si le robot avance correctement
	 */
	public void testAvance() {
		Robot r = new RobotType2(4);
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().x == 4 && r.getPosition().y == 0);
	}
}
