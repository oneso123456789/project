import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();  // n = 10;
		
		if(n % 2 == 0){	// 짝수
			System.out.println(n+"은 짝수");
		}else{
			System.out.println(n+"은 홀수");
		}
		
	}

}
