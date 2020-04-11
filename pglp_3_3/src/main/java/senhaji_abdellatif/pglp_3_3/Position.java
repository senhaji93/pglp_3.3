package senhaji_abdellatif.pglp_3_3;


public class Position {
	
	public int x;
	
	public int y;
	
	public Position() {
		x = 0;
		y = 0;
	}

	
	public Position(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
