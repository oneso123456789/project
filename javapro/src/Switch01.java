import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int s;
	System.out.println("점수를 입력하세요?");
	Scanner sc=new Scanner(System.in);
	s=sc.nextInt();	 // s=95;
    s = s / 10;
	switch (s) {
		case 10:
		case 9: System.out.println("A학점");
				 break;
		case 8: System.out.println("B학점");
				 break;
		case 7: System.out.println("C학점");
				 break;
		case 6: System.out.println("D학점");
				 break;
		default: System.out.println("F학점");		
	} // switch end

  } // main end

}
