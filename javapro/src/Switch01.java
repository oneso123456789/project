import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int s;
	System.out.println("������ �Է��ϼ���?");
	Scanner sc=new Scanner(System.in);
	s=sc.nextInt();	 // s=95;
    s = s / 10;
	switch (s) {
		case 10:
		case 9: System.out.println("A����");
				 break;
		case 8: System.out.println("B����");
				 break;
		case 7: System.out.println("C����");
				 break;
		case 6: System.out.println("D����");
				 break;
		default: System.out.println("F����");		
	} // switch end

  } // main end

}
