package sixKyu;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class WhichAreIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(inArrayStreams(new String[] {"arp", "live", "strong"},
				new String[] {"lively", "alive", "harp", "sharp", "sdf"})));

	}
	
	public static String[] inArray(String[] a1, String[] a2) {
		
		Set<String> result = new TreeSet<>();
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if (a2[i].contains(a1[j])) result.add(a1[j]);
			}
		}
		return result.toArray(String[]::new);
	}
	
	public static String[] inArrayStreams(String[] a1, String[] a2) {
		String[] result = Arrays.stream(a1)
								.filter(s1 -> Arrays.stream(a2).anyMatch(s2 -> s2.contains(s1)))
								.distinct()
								.sorted()
								.toArray(String[]::new);
								
		return result;
	}

}
