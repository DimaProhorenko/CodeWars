package eightKyu;

import java.util.Arrays;
import java.util.Collections;

public class GravityFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 1, 2};
		
		int[] a = flip('L', arr);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static int[] flip(char dir, int[] arr) {
		int[] copy = arr.clone();
		Arrays.sort(copy);
		if (dir == 'R') {
			return copy;
		}
		int[] reversed = new int[copy.length];
		
		for (int i = copy.length-1; i > -1; i--) {
			reversed[copy.length - i - 1] = copy[i];
		}
		return reversed;
	}

}
