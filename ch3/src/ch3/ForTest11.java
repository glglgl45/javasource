package ch3;

public class ForTest11 {
	public static void main(String[] args) {
		// 이중 for문
		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 5 ; j > i ; j--) {
				System.out.print(" ");
			}
			for (int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//===================================
		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 5 ; j >= 1 ; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
		System.out.println();
		//=========================
		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 5 ; j >= i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//=========================
		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 1 ; j <= 5 ; j++) {
				if (j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//=========================삼항연산자
		for (int i = 1 ; i <= 5 ; i++) {
			for (int j = 1 ; j <= 5 ; j++) {
				System.out.print(j >= i ? "*" : " ");
			}
			System.out.println();
		}
	}
}
