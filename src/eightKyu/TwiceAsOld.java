package eightKyu;

public class TwiceAsOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcAge(30, 7));

	}
	
	public static int calcAge(int dadYears, int sonYears){
	    int twice = sonYears * 2;
	    return Math.abs(twice - dadYears);
	  }

}
