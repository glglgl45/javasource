package ch3;

public class ForTest10 {
	public static void main(String[] args) {
		// 2 * 1 = 2
		// ....
		// 3 * 1 = 3
		// ....
		// 9 * 9 = 81
		for (int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j < 10 ; j++) {
				System.out.printf("%d x %d = %d\n",i,j,(i*j));
			}
			System.out.println();
		}
		System.out.println("\n");
		// 2 * 1 = 2 2 * 2 = 4....
		// 3 * 1 = 3 ......
		for (int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j < 10 ; j++) {
				System.out.printf("%d x %d = %d\t",i,j,(i*j));
			}
			System.out.println();
		}
	}
}
