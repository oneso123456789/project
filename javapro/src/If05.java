import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, n3, max, min;
		System.out.println("3���� ������ �Է��ϼ���?");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		// �ִ밪
		if(n1>=n2 && n1>=n3){
			max=n1;
		}else if(n2>=n1 && n2>=n3){
			max=n2;
		}else{
			max=n3;
		}
		//�ּҰ�
		if(n1<=n2 && n1<=n3){
			min=n1;
		}else if(n2<=n1 && n2<=n3){
			min=n2;
		}else{
			min=n3;
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
