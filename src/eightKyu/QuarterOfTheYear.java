package eightKyu;

public class QuarterOfTheYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int quarterOf(int month) {
		int quarter = 1;
		if (month >= 4 && month <= 6) quarter = 2;
		else if (month > 6 && month <= 9) quarter = 3;
		else if (month > 9) quarter = 4;
		
		return quarter;
			
	}

}
