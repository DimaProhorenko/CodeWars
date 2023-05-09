package sevenKyu;
import java.util.Arrays;
import java.util.List;

public class WeightSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orderWeight("2000 103 123 4444 99");
	}
	
	public static String orderWeight(String s) {
		List<String> l = List.of(s.trim().split(" "));
		List<Integer> result = new ArrayList<>();
		System.out.println(l);
		l.forEach(n -> {
			String[] chars = n.split("");
			int sum = Arrays.stream(chars).mapToInt(el -> Integer.parseInt(el)).sum();
			
		});
		return "";
	}

}
