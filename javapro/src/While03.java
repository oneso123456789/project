import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1, dan;
		System.out.println("���ϴ� ���� �Է� �ϼ���");
		Scanner sc= new Scanner(System.in);
		dan = sc.nextInt();  // dan=5;
		
		System.out.println("["+dan+"��]");
		while(i<=9){
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		
	}

}
