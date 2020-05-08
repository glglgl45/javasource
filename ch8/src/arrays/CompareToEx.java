package arrays;

public class CompareToEx {
	public static void main(String[] args) {
		String str1 = "a";	//97
		String str2 = "b";	//98
		String str3 = "c";	//99
		
		//	a - b : 97 - 98
		System.out.println(str1.compareTo(str2));	// -1
		System.out.println(str1.compareTo(str3));	// -2 ( 97 - 99)
	}
}
