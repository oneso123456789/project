class Sawon2 extends Object{		// 부모 클래스
	String name;
	String dept;
	int salary;

	public Sawon2(String name, String dept, int salary) {
		super();
		this.name = name;		// 오정원
		this.dept = dept;       // 영업부
		this.salary = salary;   // 100000000
	}

	String displayInfo(){
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
	}
}

class Sales2 extends Sawon2{	// 자식 클래스
	int commition;	// 70000000
	
	public Sales2(String name, String dept, int salary, int commition) {
		//super()
		super(name, dept, salary);//부모 클래스의 생성자 호출
		this.commition = commition;
	}
	/*String displayInfo(){
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary 
				+ ", commition = " + commition;
	}*/
	String displayInfo(){	// 메소드 오버라이딩
		return super.displayInfo() +  ", 수당 : " + commition;
	}
}

public class SuperConstructorTest {
	/**
	 * super() 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales2 sales2 = new Sales2("오정원","영업부",100000000,70000000);
		System.out.println(sales2.displayInfo());
	}
}
