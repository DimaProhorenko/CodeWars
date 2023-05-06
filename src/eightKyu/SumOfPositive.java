package eightKyu;
import java.util.Arrays;
public class SumOfPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[] {1,-4,7,12}));
	}

	
	public static int sum(int[] arr) {
		return Arrays.stream(arr).reduce(0, (subTotal, el) -> el > 0 ? subTotal += el : subTotal);
	}
}
