class Sawon{		// 부모 클래스
	String name;
	String dept;
	int salary;

	String displayInfo(){
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
	}
}
class Sales extends Sawon{	// 자식 클래스
	int commition;	
	/*String displayInfo(){
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary 
				+ ", commition = " + commition;
	}*/
	String displayInfo(){	//메소드 오버라이딩
		return super.displayInfo() + ", 수당 : " + commition;
	}
}
public class SuperTest {
	/**
	 * Super 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sales sales = new Sales();
        System.out.println(sales.displayInfo());
	}
}
