class Sawon{		// �θ� Ŭ����
	String name;
	String dept;
	int salary;

	String displayInfo(){
		return "�̸� : " + name + ", �μ� : " + dept + ", ���� : " + salary;
	}
}
class Sales extends Sawon{	// �ڽ� Ŭ����
	int commition;	
	/*String displayInfo(){
		return "�̸� : " + name + ", �μ� : " + dept + ", ���� : " + salary 
				+ ", commition = " + commition;
	}*/
	String displayInfo(){	//�޼ҵ� �������̵�
		return super.displayInfo() + ", ���� : " + commition;
	}
}
public class SuperTest {
	/**
	 * Super �׽�Ʈ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sales sales = new Sales();
        System.out.println(sales.displayInfo());
	}
}
