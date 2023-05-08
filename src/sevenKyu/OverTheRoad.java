package sevenKyu;

public class OverTheRoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getAddressAcross(4, 6));
		
		System.out.println(Math.ceil(5 % 2));
	}

	
	public static long getAddressAcross(long address, long n) {
//		long opositePosition = (int) Math.floor(address / 2);
//		return (n - opositePosition) * 2;
		
//		if (address % 2 != 0) {
//			System.out.println("OOps");
//			return (long) (n -  Math.floor(address / 2)) * 2;
//		}
//		return (long) ((n - address / 2) * 2) + 1;
		
		return (long) (((n - Math.floor(address / 2)) * 2) + Math.ceil(++address % 2));
	}
}
