package eightKyu;

public class Quadrants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int quadrant(int x, int y) {
		int result = 1;

		if (x < 0 && y > 0) result = 2;
		if (x < 0 && y < 0) result = 3;
		if (x > 0 && y < 0) result = 4;
		
		return result;
	}

}
