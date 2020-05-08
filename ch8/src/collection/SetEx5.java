package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx5 {
	public static void main(String[] args) {
		Set<MemberVO> set = new HashSet<MemberVO>();
		
		// MemberVO객체를 3개 생성한 후 set에 담기
		// 단, id와 pwd가 같은 경우 담지 않도록 설정
		set.add(new MemberVO("hong","hong","홍길동"));
		set.add(new MemberVO("hong1","hong1","홍길동"));
		set.add(new MemberVO("hong","hong","홍길동"));
		set.add(new MemberVO("hong1","hong","홍길동"));
		
		System.out.println(set);
	}
}
