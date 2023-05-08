package sevenKyu;
import java.util.List;
import java.util.ArrayList;
public class FindYourCaterer {
	private static final int C_1 = 15;
	private static final int C_2 = 20;
	private static final int C_3 = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(1500, 60));

	}

	public static int find(int budget, int people) {
		if (people < 1) return -1;
		
		List<Integer> l = new ArrayList<>();
		l.add(people * C_1);
		l.add(people * C_2);
		
		if (people > 60) {
			l.add((int) (people * C_3 * 0.8));
		} else {
			l.add(people * C_3);
		}
		
		System.out.println(l);
		
		if (l.get(0) > budget) return -1;
		
		int best = l.stream().filter(n -> n <= budget).max(Integer::compare).get();
		return l.indexOf(best) + 1;
	}
	
}
