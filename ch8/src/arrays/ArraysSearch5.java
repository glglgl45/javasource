package arrays;

import java.util.Arrays;

public class ArraysSearch5 {
	public static void main(String[] args) {
		String x[] = {	"abstract","assert","boolean","break",
						"byte","case","catch","char","class",
						"const","continue","default","db",
						"else","enum","funal","finally",
						"import","instanceof","native","new",
						"package","private","return","short",
						"static","strictfp","switch",
						"synchronized","this","try","void","while"
		};
		
		// private 문자열 찾기
		System.out.println(Arrays.binarySearch(x, "private"));
	}
}
