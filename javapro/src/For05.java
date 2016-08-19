import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan;
		System.out.println("원하는 단을 입력 하세요");
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();	// dan=5;
		
		System.out.println("["+dan+"단]");
		for(int i=1; i<=9; i++){
		  System.out.println(dan+"*"+i+"="+ dan*i);
		}
		
	}

}




