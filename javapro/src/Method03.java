import java.util.Scanner;

public class Method03 {

	static int max(int n1, int n2){// n1=30, n2=10
		if(n1>n2){   
			return n1;
		}else{
			return n2;
		}
	}	
	static int min(int n1, int n2){// n1=30, n2=10
		if(n1<n2){   
			return n1;
		}else{
			return n2;
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, max, min;
		System.out.println("2개의 정수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();		// n1=30
		n2 = sc.nextInt();		// n2=10
		max= max(n1, n2);
		min= min(n1, n2);
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
