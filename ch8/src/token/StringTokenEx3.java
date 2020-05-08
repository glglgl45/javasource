package token;

import java.util.StringTokenizer;
/* String : split() => regex 기준
 * StringTokenizer : 간단(구분자를 하나의 문자만 사용 가능)
 * 
 */

public class StringTokenEx3 {

	public static void main(String[] args) {
		String str = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer token = new StringTokenizer(str,",|");
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

	}

}
