package sevenKyu;
import java.util.Map;
import java.util.HashMap;

public class AlphabetWar {
	
	public static void main(String[] args) {
		leftSide = new HashMap<>();
		leftSide.put('w', 4);
		leftSide.put('p', 3);
		leftSide.put('b', 2);
		leftSide.put('s', 1);
		
		rightSide = new HashMap<>();
		rightSide.put('m', 4);
		rightSide.put('q', 3);
		rightSide.put('d', 2);
		rightSide.put('z', 1);
		
		System.out.println(war("z"));
	}

	static Map<Character, Integer> leftSide;
	static Map<Character, Integer> rightSide;
	
	public static String war(String s) {
		int leftCount = 0;
		int rightCount = 0;
		String message = "Let's fight again!";
		
		for (int i = 0; i < s.length(); i++) {
			if (leftSide.containsKey(s.charAt(i))) {
				leftCount += leftSide.get(s.charAt(i));
			} else if (rightSide.containsKey(s.charAt(i))) {
				rightCount += rightSide.get(s.charAt(i));
			}
		}
		if (leftCount > rightCount) {
			message = "Left side wins!";
		} else if (rightCount > leftCount) {
			message = "Right side wins!";
		}
		return message;
	}

}
