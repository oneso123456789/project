import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, dan;
		System.out.println("���ϴ� ���� �Է� �ϼ���");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();		// dan=3;
		
		do{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}while(i<=9);
		
	}

}
