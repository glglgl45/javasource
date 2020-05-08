package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {	
		List<String> list = new Vector<String>();
		
		list.add("박보검");
		list.add("송강호");
		list.add("류준열");
		list.add("현빈");
		list.add("손예진");
		list.add("유해진");
		
		System.out.println(list);	// toString 오버라이딩 되어 있음
		System.out.println(list.size());	// 리스트의 크기
		System.out.println(list.isEmpty());	// 리스트가 비어있는지의 여부
		System.out.println(list.contains("송강호"));
		System.out.println("특정요소 : " + list.get(3));	// 특정요소 가져오기
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove("류준열"));
		System.out.println(list);
		
		// list.sort(Comparator.reverseOrder());	// 내림차순
		list.sort(Comparator.naturalOrder());	// 오름차순
		System.out.println("정렬 후 : " + list);
		
		// 리스트를 배열로 변경
		Object[] strArr = list.toArray();
		System.out.println(Arrays.toString(strArr));
		
		list.clear();	// 리스트 객체 모두 삭제
		System.out.println(list);
		
		String fruit[] = {"사과","딸기","바나나","수박","참외","자두"};
		
		// List<String> fruits = Arrays.asList(fruit); 추가시 exception 발생
		List<String> fruits = new ArrayList<String>(Arrays.asList(fruit));
		fruits.add("메론");	// java.lang.UnsupportedOperationException
		System.out.println(fruits);
		
	}
}
