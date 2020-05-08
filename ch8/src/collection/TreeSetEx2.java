package collection;

import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(35);
		tree.add(95);
		tree.add(65);
		tree.add(88);
		tree.add(27);
		tree.add(49);
		tree.add(52);
		tree.add(15);
		
		// 가장 낮은 점수 출력
		System.out.println(tree.first());
		// 가장 높은 점수 출력
		System.out.println(tree.last());
		// 88 보다 낮은 점수 출력
		System.out.println(tree.lower(88));
		// 88 보다 높은 점수 출력
		System.out.println(tree.higher(88));
	}
}
