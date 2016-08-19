
public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// continue문 : 다시 반복문으로 돌아가라는 의미로 사용됨
		
//		for(int i=1; i<=10; i++){
//			
//			if(i == 5) continue;
//			System.out.println("출력="+i);
//		}

// 1 ~ 100 까지 짝수만 출력		
//		for(int i=1; i<=100; i++){
//			if(i%2 == 1) continue;   // 홀수
//			System.out.println("짝수="+i);
//		}
		
// 1 ~ 100 까지 5의 배수만 출력
		for(int i=1; i<=100; i++){
			if(i%5 != 0) continue;
			System.out.println("5의 배수="+i);
		}
		
		
	}

}
