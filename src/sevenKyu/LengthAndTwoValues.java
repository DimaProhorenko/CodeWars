package sevenKyu;
import java.util.Arrays;


public class LengthAndTwoValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(alternate(10, "Wow", "Jam")));

	}
	
	public static String[] alternate(int n, String firstValue, String secondValue) {
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arr[i] = firstValue;
			} else {
				arr[i] = secondValue;
			}
		}
		return arr;
	}

}
