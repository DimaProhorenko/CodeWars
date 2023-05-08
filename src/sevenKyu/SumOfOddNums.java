package sevenKyu;
import java.util.stream.IntStream;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rowSumOddNums(2));
	}
	
	
	public static int rowSumOddNums(int n) {
		int firstNum = n * n - (n - 1);
		return IntStream.iterate(firstNum, i -> i + 2).limit(n).sum();
		
	}

}
