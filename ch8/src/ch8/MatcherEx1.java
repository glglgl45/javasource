package ch8;

public class MatcherEx1 {
	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		
		System.out.println("aa 를 " + stringCount(src, "aa") + " 개 찾았습니다.");
		
		System.out.println(src);
	}
	
	static int stringCount(String src, String key) {
		int count = 0;		
		while (src.contains(key)) {
			if (src.contains(key)) {
				count++;
				src = src.replaceFirst(key, "");
			}
		}		
//		boolean run = true;
//		
//		while (run) {
//			if (src.contains(key)) {
//				count++;
//				src = src.replaceFirst(key, "");
//			} else {
//				run = false;
//			}
//		}
		return count;
	}
}
