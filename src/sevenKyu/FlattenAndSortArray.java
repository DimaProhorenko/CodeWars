package sevenKyu;
import java.util.Arrays;
public class FlattenAndSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(flattenAndSort(new int[][] {{3, 5, 4}, {5, 8, 1}, {9, 2, 4}})));
	}
	
	public static int[] flattenAndSort(int[][] array) {
		
		return Arrays.stream(array).flatMapToInt(el -> Arrays.stream(el)).sorted().toArray();
		
	}

}
