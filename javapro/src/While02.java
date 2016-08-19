
public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~100까지 홀수, 짝수의 합구하기

		int i=1, odd=0, even=0;		// 초기값
		while(i<=100){				// 조건식
			if(i%2 == 1){	// 홀수
				odd+=i;
			}else{			// 짝수
				even+=i;
			}
			i++;					// 증감식
		}		
		System.out.println("1~100 홀수의 합="+odd);
		System.out.println("1~100 짝수의 합="+even);
				
	}

}
