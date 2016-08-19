import java.util.Scanner;

public class WrapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("원하는 단을 입력 하세요");
		Scanner sc= new Scanner(System.in);
		String dan = sc.next(); // dan="5";
		int n = Integer.parseInt(dan); // n = 5;
		
		for(int i=1; i<=9; i++)
			System.out.println(n+"*"+i+"="+n*i);
		
	}

}
