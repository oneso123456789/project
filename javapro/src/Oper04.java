import java.util.Scanner;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������
		// ���� = (���ǽ�) ? ��1 : ��2;
		int a, b;
		int max, min;
		
		System.out.println("���� 2���� �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);		
		a = sc.nextInt();	// a=10
		b = sc.nextInt();	// b=5	

		max = (a > b) ? a : b;
		min = (a < b) ? a : b;
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
