import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		System.out.println("������ �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();	// s = 85;
		
		if(s >= 90){
			System.out.println("A����");
		}else if(s >=80){
			System.out.println("B����");
		}else if(s >= 70){
			System.out.println("C����");
		}else if(s >= 60){
			System.out.println("D����");
		}else{
			System.out.println("F����");
		}
		
		
	}

}
