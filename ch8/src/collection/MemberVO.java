package collection;

public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	public MemberVO(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MemberVO) {
			MemberVO vo = (MemberVO)obj;
			return vo.id.equals(this.id) && vo.pwd.equals(this.pwd);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return id.hashCode()+pwd.hashCode();
	}
	@Override
	public String toString() {
		return id + "," + pwd + "," + name;
	}

}
