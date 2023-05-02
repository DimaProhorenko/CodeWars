package eightKyu;

public class InvertValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] invert(int[] array) {
		int[] inverted = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			inverted[i] = array[i] * -1;
		}
		return inverted;
	}

}
