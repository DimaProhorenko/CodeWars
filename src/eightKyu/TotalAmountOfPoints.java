package eightKyu;

import java.util.Arrays;

public class TotalAmountOfPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(points(new String[] {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
	}
	
	public static int points(String[] arr) {
		int sum = 0;
		for (String el:arr) {
			char[] ca = el.toCharArray();
			
			if (Character.getNumericValue(ca[0]) > Character.getNumericValue(ca[2])) {
				sum += 3;
				
			} else if (Character.getNumericValue(ca[0]) == Character.getNumericValue(ca[2])) {
				sum++;
				
			}
		}
		
		return sum;
	}

}
