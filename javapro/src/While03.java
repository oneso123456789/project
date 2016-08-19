import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1, dan;
		System.out.println("원하는 단을 입력 하세요");
		Scanner sc= new Scanner(System.in);
		dan = sc.nextInt();  // dan=5;
		
		System.out.println("["+dan+"단]");
		while(i<=9){
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		
	}

}
