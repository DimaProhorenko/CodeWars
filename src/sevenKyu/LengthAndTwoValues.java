package sevenKyu;
import java.util.Arrays;
import java.util.stream.IntStream;


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
	
	public static String[] alternate2(int n, String firstValue, String secondValue) {
		return IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? firstValue : secondValue).toArray(String[]::new);
	}

}
