class Sawon2 extends Object{		// �θ� Ŭ����
	String name;
	String dept;
	int salary;

	public Sawon2(String name, String dept, int salary) {
		super();
		this.name = name;		// ������
		this.dept = dept;       // ������
		this.salary = salary;   // 100000000
	}

	String displayInfo(){
		return "�̸� : " + name + ", �μ� : " + dept + ", ���� : " + salary;
	}
}

class Sales2 extends Sawon2{	// �ڽ� Ŭ����
	int commition;	// 70000000
	
	public Sales2(String name, String dept, int salary, int commition) {
		//super()
		super(name, dept, salary);//�θ� Ŭ������ ������ ȣ��
		this.commition = commition;
	}
	/*String displayInfo(){
		return "�̸� : " + name + ", �μ� : " + dept + ", ���� : " + salary 
				+ ", commition = " + commition;
	}*/
	String displayInfo(){	// �޼ҵ� �������̵�
		return super.displayInfo() +  ", ���� : " + commition;
	}
}

public class SuperConstructorTest {
	/**
	 * super() �׽�Ʈ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales2 sales2 = new Sales2("������","������",100000000,70000000);
		System.out.println(sales2.displayInfo());
	}
}
