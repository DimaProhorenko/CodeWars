package sevenKyu;

import java.util.Arrays;

public class RuleOfDivisibilityBySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(seven(477557101)));
	}
	
	public static long[] seven(long m) {
		long n = m;
		long counter = 0;
		while (n >= 100) {
			n = (n / 10) - (n % 10 * 2);
			counter++;
		}
		return new long[] {n, counter};
	}

}
