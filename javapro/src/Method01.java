
public class Method01 {
	// 메소드(Method): 재사용 가능한 코드들의 집합

	// 사용자 정의 메소드
	static void check() {	// 정적 메소드
		System.out.println("호출성공");		
	}
//  Call by value(값 전달에 의한 메소드 호출)	
	static void check01(int a){//매개변수(parameter)
		System.out.println("전달된 값="+a);//int a=30;
	}
	static void check02(int a, double b){
		System.out.println(a+b);
	}
// Call by reference(주소값 전달에 의한 메소드 호출)	
	static void check03(String s){
		System.out.println("전달된 값="+s);
	}
	static int check04(){
		return 50;//return:메소드를 호출한곳에 값을 
				  //       돌려 주는 역할		
	}
	static double check05(int a, double b){
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
		check01(30);
		check02(10, 3.14);
		check03(new String("자바"));
		System.out.println("돌려 받은값1="+check04());
		int re = check04();
		System.out.println("돌려 받은값2="+re);
		System.out.println("돌려 받은값3="+
							check05(30, 42.195));
	}

}
