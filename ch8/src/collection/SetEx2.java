package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Jave");
		list.add("Jave");
		list.add("JDBC");
		list.add("mysql");
		list.add(2,"mybatis");
		
		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
		set.add("Jave");
		set.add("Jave");
		set.add("JDBC");
		set.add("mysql");
		// set.add(2,"mybatis");
		
		System.out.println(set);
	}
}
