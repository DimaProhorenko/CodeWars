package sixKyu;
import java.util.Set;
import java.util.HashSet;

public class MultiplesOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
	}
	
	
	public static int solution(int n) {
		Set<Integer> multiples = new HashSet<>();
		
		for (int i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				multiples.add(i);
			}
		}
		
		return multiples.stream().reduce(0,  (a, b) -> a + b);
	}

}
