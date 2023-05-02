package sevenKyu;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class HighestAndLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(highAndLow("1 8 6 3 9 2"));

	}
	
	public static String highAndLow(String numbers) {
		
		String[] nums = numbers.split(" ");
		List<Integer> numList = new ArrayList<>();
		
		for (String number:nums) {
			numList.add(Integer.parseInt(number));
		}
		
		Collections.sort(numList);
		
		System.out.println(numList);
		
		return String.format("%d %d", numList.get(0), numList.get(numList.size()-1));
	}

}
