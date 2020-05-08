package token;

import java.util.StringTokenizer;
/* String : split() => regex 기준
 * StringTokenizer : 간단(구분자를 하나의 문자만 사용 가능)
 * 
 */

public class StringTokenEx4 {
	public static void main(String[] args) {
		String str = "x=100*(200+300)/2";
		StringTokenizer token = new StringTokenizer(str,"=*+()/",true);
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
