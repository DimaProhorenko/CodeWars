package sixKyu;

public class NarcissisticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNarcissistic(153));
	}
	
	public static boolean isNarcissistic(int n) {
		char[] ch = Integer.toString(n).toCharArray();
		
		int sum = 0;
		
		for (char c:ch) {
			double num = Math.pow(Character.getNumericValue(c), ch.length);
			sum += num;
		}
		
		return sum == n;
	}

}
