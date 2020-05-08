package collection;

import java.util.HashSet;
import java.util.Set;
/* 중복 데이터 제거
 * 객체의 hashCode() 값을 호출해서 값을 얻어냄
 * 이미 앞에서 저장된 객체들의 hashCode와 비교한 후 
 * hashCode가 다르면 다른 객체로 간주하고 저장
 * 만약에 hashCode가 같다면 equals() 까지 비교 후 true로 나오면
 * 중복 객체로 간주
 */
public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Java");
		set.add("Test");
		set.add("Swing");
		set.add("Java");
		// 중복 데이터 제거
		System.out.println(set);
		
		System.out.println("set empty : " + set.isEmpty());
		System.out.println("Test 포함 여부 : " + set.contains("Test"));
		System.out.println("Set 크기 : " + set.size());
		System.out.println("특정 객체 삭제 : " + set.remove("Swing"));
		System.out.println(set);
	}
}
