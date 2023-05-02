package sevenKyu;
import java.util.Set;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TwoToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));

	}
	
	public static String longest(String a, String b) {
		Set<String> setA = new TreeSet<>(Arrays.asList(a.split("")));
		Set<String> setB = new TreeSet<>(Arrays.asList(b.split("")));
		Set<String> mergedSet = new TreeSet<>();
		mergedSet.addAll(setA);
		mergedSet.addAll(setB);
		return String.join("",mergedSet);
	}

}
