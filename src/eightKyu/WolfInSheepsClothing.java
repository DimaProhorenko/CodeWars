package eightKyu;

import java.util.Arrays;

public class WolfInSheepsClothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(warnTheSheep(new String[] {"Sheep", "sheep", "wolf", "sheep"}));
	}

	
	
	public static String warnTheSheep(String[] array) {
		
		int wolfIndex = Arrays.asList(array).indexOf("wolf");
		int sheepIndex = wolfIndex < array.length - 1 ? wolfIndex + 1 : -1;
		int sheepNumber = array.length - sheepIndex;
		
		String message = "Pls go away and stop eating my sheep";
		
		if (sheepIndex > -1) {
			message = String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", sheepNumber);
		}
		
		return message;
		
	}
}
