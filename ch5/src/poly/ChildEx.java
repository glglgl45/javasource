package poly;

public class ChildEx {
	public static void main(String[] args) {
//		Child child = new Child();
//		
//		child.field1 = "parent_field";
//		child.field2 = "parent_field2";
//		child.method1();
//		child.method2();
//		child.method3();
		
		// 다형성 => 범위제한(부모가 가지고 있는 멤버변수나 메소드만 접근 가능)]
		// 단, 오버라이딩 된 메소드가 있다면 자식 객체의 메소드가 실행됨
		Parent parent = new Child();
		parent.field1="parent_field1";
		parent.method1();
		parent.method2();
		
		// method3 접근?
		Child child2 = (Child) parent;
		child2.method3();
	}

}
