package poly;

public class EmployeeEx {

	public static void main(String[] args) {
		Worker worker = new Worker();
		
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		worker.work(employee);
		//work(employee);
		
		Ceo ceo = new Ceo();
		ceo.setName("사장님");
		ceo.setPosition("대빵");
		worker.work(ceo);
		//work(ceo);
		
		Adminstrator admin = new Adminstrator();
		admin.setName("김정우");
		admin.setPosition("관리자");
		worker.work(admin);
		//work(admin);
		
		PartTime part = new PartTime();
		part.setName("김알바");
		part.setPosition("아르바이트");
		worker.work(part);
		//work(part);
	}

	public static void work(Employee employee) {
		employee.work();		
	}
//	public static void work(Ceo ceo) {
//		ceo.work();		
//	}

}
