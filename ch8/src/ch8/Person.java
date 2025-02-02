package ch8;

public class Person {
	private String id;
	private String name;
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		// id와 name이 같으면 동일하다고 리턴
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			return this.id.equals(p.id) && this.name.equals(p.name);
			
		}
		return false;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	

}
