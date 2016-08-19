import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[3];
		int sum=0;
		double avg;
		System.out.println("3과목의 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);			
		
		for(int i=0; i<3; i++){
			s[i] = sc.nextInt();
			sum += s[i];	// sum=sum+s[i];
		}		
		avg = sum / 3.0;
		System.out.println("총점="+sum);
		System.out.println("평균="+avg);
	}

}
