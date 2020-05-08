package ch4;

public class ArrayTest14 {
	public static void main(String[] args) {
		int oldScore[][] = { {12,13} , {14,15} };
		
		int newScore[][] = new int[oldScore.length][oldScore[0].length];
		
		for (int i = 0 ; i < oldScore.length ; i++) {
			for (int j = 0 ; j < oldScore[i].length ; j++) {
				newScore[i][j] = oldScore[i][j];
			}
		}
		
		for (int arr[] : oldScore) {
			for (int j : arr) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
