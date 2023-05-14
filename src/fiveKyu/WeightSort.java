package fiveKyu;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WeightSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
	}
	
	public static int compareWeights(String[] n1, String[] n2) {
		int diff = getNumWeight(n1) - getNumWeight(n2);
		return diff == 0 ? String.join("", n1).compareTo(String.join("", n2)) : diff < 0 ? -1 : 1;
	}
	
	public static int getNumWeight(String[] n) {
		return Arrays.stream(n).mapToInt(Integer::parseInt).sum();
	}
	
	public static String orderWeight(String s) {
		List<String> l = List.of(s.trim().split(" "));
		List<String[]> c = l.stream().map(el -> el.split("")).toList();
		List<String[]> a = c.stream().sorted(WeightSort::compareWeights).toList();
		
		return a.stream().map(el -> String.join("", el)).collect(Collectors.joining(" "));
		
	}

}
