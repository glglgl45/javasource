package ch4;

public class ArrayTest16A {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,40,30},
				{40,50,20},
				{50,60,50}
		};
		int result[][] = new int[score.length+1][score[0].length+1];
		// 4*6
		for (int i = 0 ; i < score.length ; i++) {
			for (int j = 0 ; j < score[i].length ; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j];
				result[score.length][j] += score[i][j];
				result[score.length][score[i].length] += score[i][j];
			}
		}
		for (int arr[] : result) {
			for (int j : arr) {
				System.out.print(j + "	");
			}
			System.out.println();
		}
		
	}
}
