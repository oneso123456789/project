
public class Animal {
//           사용자 정의 클래스
	int age;// 멤버변수,전역변수,field
	
	public Animal(){//기본 생성자(default Constructor)
		System.out.println("생성자 호출 성공");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;// 지역 변수
		String s1     = "자바";
		String s2     =     new     String("자바");
		
	   Animal a1          = new     Animal();
//     클래스 레퍼런스변수	연산자	생성자호출	
	   System.out.println("age="+ a1.age);
	   
	   Animal a2          = new     Animal();
	   a2.age = 20;
	   System.out.println("age="+ a2.age);
	   
	   if(a1 == a2){
		   System.out.println("같은 주소");
	   }else{
		   System.out.println("다른 주소"); 
	   }
	}

}
