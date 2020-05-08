package ch4;

public class ArrayTest15 {
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
			}
		}
		int sum1 = 0;
		// 각 행의 마지막 열에 값을 담을 변수
		int sum2[] = new int[result.length];
		// [] [] [] [] 각 열의 마지막 행에 값을 담을 행렬
		for (int i = 0 ; i < result.length ; i++) {
			for (int j = 0 ; j < result[i].length ; j++) {
				if (j == result[i].length-1) {
					result[i][j] = sum1;
					sum1 = 0;
				} else {
					sum1 += result[i][j];
				}
				sum2[j] += result[i][j];
				if (i == result.length-1) {
					result[i][j] = sum2[j];
				}
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
