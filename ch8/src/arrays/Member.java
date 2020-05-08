package arrays;

public class Member implements Comparable<Member> {
	private String name;
	private Integer id;

	public Member(String name,int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return id + ":" + name;
	}
	@Override
	public int compareTo(Member o) {
		//return this.name.compareTo(o.name);	// 오름차순
		return o.id.compareTo(this.id);		// 내림차순
	}	
}
