import java.lang.String; // 생략 가능
import java.lang.System;

public class Test {
	// 사용자 정의 클래스

	public static void main(String ar[]) {
		// 메인 메소드(프로그램 실행의 진입점 역할)
//		Integer it = new Integer();
		
		Integer it0 = new Integer(50);
		
		Integer it1 = new Integer("50");
		
		// TODO Auto-generated method stub
		System.out.print("출력 성공");
		System.out.println();
		System.out.print("출력");
		System.out.println();
		System.out.println("출         력");
		System.out.println("출\t\t력");
		
		System.out.println("PI="+Math.PI);
		System.out.println(Math.random());
		
	}

}
