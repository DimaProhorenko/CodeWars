package sixKyu;

import java.util.Arrays;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] result = getTable(3);
		
		for (int[] item:result) {
			System.out.println(Arrays.toString(item));
		}
	}
	
	
	public static int[][] getTable(int n) {
		
			int[][] result = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					result[i][j] = (i + 1) * (j + 1);;
				}
			}
		
		
		return result;
	}

}
