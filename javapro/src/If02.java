import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();  // n = 10;
		
		if(n % 2 == 0){	// ¦��
			System.out.println(n+"�� ¦��");
		}else{
			System.out.println(n+"�� Ȧ��");
		}
		
	}

}
