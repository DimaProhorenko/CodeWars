package sevenKyu;

public class Holliday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fireFight("Boat Rudder Mast Boat Hull Water ~~ Boat Deck Hull ~~ Propeller Deck ~~ Deck Boat Mast"));
	}
	
	public static String fireFight(String s) {
		return s.replaceAll("Fire", "~~");
	}
}
