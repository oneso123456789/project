import java.util.Scanner;

public class Report_2016_05_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, f=1;
		
		System.out.print("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();	// n=3
		
		for(int i=1; i<=n; i++){
//		for(int i=n; i>=1; i--){
			f = f * i;      // f *= i;
//			3 = 1 * 3
//			6 = 3 * 2
//			6 = 6 * 1
		}
		System.out.println(n+"!="+f);	
	}

}
