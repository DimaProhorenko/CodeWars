package sixKyu;

import java.util.List;
import java.util.ArrayList;


public class ConsecutivePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigPow(10, 150));
	}
	
	
	public static List<Long> sumDigPow(long a, long b) {
		List<Long> nums = new ArrayList<>();
		
		for (long i = a; i <= b; i++) {
			if (i < 10) nums.add(i);
			else if (i > 10) {
				String[] numArr = String.valueOf(i).split("");
				long sum = 0;
				for (int j = 0; j < numArr.length; j++) {
					sum += Math.pow(Integer.parseInt(numArr[j]), j+1);
				}
				if (i == sum) {
					nums.add(i);
				}
			}
		}
		
		return nums;
	}

}
