import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, max, min;
		System.out.println("정수2개를 입력하세요");
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		
//		if(n1>n2){
//			max = n1;
//		}else{
//			max = n2;
//		}
		
		max=Math.max(n1, n2);
		min=Math.min(n1, n2);
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
