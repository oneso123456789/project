
public class WrapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// �ڽ�(boxing): Heap�޸𸮸� �Ѱ��� �ڽ��� �����ϰ�
//               Stack�޸𸮿� �ִ� �����͸� 
//     		     Heap�޸𸮷� �����ϴ� ��.		         
// ��ڽ�(unboxing): Heap�޸��� �����͸� Stack�޸𸮷�
//		             �����ϴ� ��.
		int n=10;	// ��������
		Integer num1 = new Integer(n);//�ڽ�(boxing)
//		Integer num1 = n;//����ڽ�(auto boxing)
		Integer num2 = new Integer("20");
		
		// ��ڽ�(unboxing)
		int n1 = num1.intValue(); //int n1 = 10;
		int n2 = num2.intValue(); //int n2 = 20;
		
		// ���� ��ڽ�
//		int n1 = num1; //int n1 = 10;
//		int n2 = num2; //int n2 = 20;
		
		System.out.println("n1+n2="+(n1+n2));
		
		System.out.println("2������="+Integer.toBinaryString(n1+n2));
		System.out.println("8������="+Integer.toOctalString(n1+n2));
		System.out.println("16������="+Integer.toHexString(n1+n2));
		
		System.out.println("max="+Integer.MAX_VALUE);
		System.out.println("min="+Integer.MIN_VALUE);
		
		
	}

}
