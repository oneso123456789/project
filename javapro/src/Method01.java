
public class Method01 {
	// �޼ҵ�(Method): ���� ������ �ڵ���� ����

	// ����� ���� �޼ҵ�
	static void check() {	// ���� �޼ҵ�
		System.out.println("ȣ�⼺��");		
	}
//  Call by value(�� ���޿� ���� �޼ҵ� ȣ��)	
	static void check01(int a){//�Ű�����(parameter)
		System.out.println("���޵� ��="+a);//int a=30;
	}
	static void check02(int a, double b){
		System.out.println(a+b);
	}
// Call by reference(�ּҰ� ���޿� ���� �޼ҵ� ȣ��)	
	static void check03(String s){
		System.out.println("���޵� ��="+s);
	}
	static int check04(){
		return 50;//return:�޼ҵ带 ȣ���Ѱ��� ���� 
				  //       ���� �ִ� ����		
	}
	static double check05(int a, double b){
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
		check01(30);
		check02(10, 3.14);
		check03(new String("�ڹ�"));
		System.out.println("���� ������1="+check04());
		int re = check04();
		System.out.println("���� ������2="+re);
		System.out.println("���� ������3="+
							check05(30, 42.195));
	}

}
