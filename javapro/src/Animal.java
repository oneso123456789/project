
public class Animal {
//           ����� ���� Ŭ����
	int age;// �������,��������,field
	
	public Animal(){//�⺻ ������(default Constructor)
		System.out.println("������ ȣ�� ����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;// ���� ����
		String s1     = "�ڹ�";
		String s2     =     new     String("�ڹ�");
		
	   Animal a1          = new     Animal();
//     Ŭ���� ���۷�������	������	������ȣ��	
	   System.out.println("age="+ a1.age);
	   
	   Animal a2          = new     Animal();
	   a2.age = 20;
	   System.out.println("age="+ a2.age);
	   
	   if(a1 == a2){
		   System.out.println("���� �ּ�");
	   }else{
		   System.out.println("�ٸ� �ּ�"); 
	   }
	}

}
