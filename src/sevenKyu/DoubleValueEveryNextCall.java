package sevenKyu;

public class DoubleValueEveryNextCall {
	private static int n = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNumber());
		System.out.println(getNumber());
		System.out.println(getNumber());
	}
	
	public static int getNumber() {
		if (n == 0) return ++n;
		return n *= 2;
	}

}
