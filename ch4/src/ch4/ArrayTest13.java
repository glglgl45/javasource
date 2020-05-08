package ch4;

import java.util.Scanner;

public class ArrayTest13 {
	public static void main(String[] args) {
		String words[] = {"television","computer","mouse","phone"};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < words.length ; i++) {
			char[] question = words[i].toCharArray();
			for (int j = 0 ; j < question.length ; j++) {
				int pos = (int)(Math.random()*question.length);
				char temp = question[j];
				question[j] = question[pos];
				question[pos] = temp;
			}
			String answer = sc.nextLine();
			if (answer.equals(question[i])) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		}

//		char[] question = words[0].toCharArray();
//		
//		for(char ch : question) {
//			System.out.print(ch + " ");
//		}
	}
}
