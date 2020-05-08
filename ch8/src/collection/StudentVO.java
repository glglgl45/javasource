package collection;

public class StudentVO {
	private int num;
	private String name;
	public StudentVO(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// String이 정의한 hashcCode()값
		return name.hashCode();
	//	return this.num;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentVO) {
			StudentVO vo = (StudentVO)obj;
			return this.name.equals(vo.name);
		}
		return false;
//		if(obj instanceof StudentVO) {
//			StudentVO vo = (StudentVO)obj;
//			return this.num == vo.num;
//		}
//		return false;
	}	
	@Override
	public String toString() {
		return num + ":" + name;
	}

}
