import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 변수:메모리상에 데이터를 저장하는 기억공간	
// 변수 만드는 방법:  자료형 변수명 = 데이터;
		
// 정수형 변수	( 지역 변수 : 스택 영역에 저장됨 )
	byte b = 10;
	short s = 100;
	int i = 1000;
	long l = 10000;
	System.out.println("b="+b);
	System.out.println("s="+s);
	System.out.println("i="+i);
	System.out.println("l="+l);
	System.out.println("b="+b+" s="+s+" i="+i+" l="+l);

// 실수형 변수
	float ft = 3.14f;
	double d = 42.195;
	System.out.println("ft="+ft+" d="+d);
	System.out.printf("%.2f",d);// 소수 2째자리까지 출력
	System.out.println();
	
// 문자형 변수
	char c1 = 'j';
	char c2 = '자';
	System.out.println("c1="+c1+" c2="+c2);
	
// 논리형 변수
	boolean b1 = true;
	boolean b2 = false;
	System.out.println("b1="+b1+" b2="+b2);
	
// 참조형(클래스)
	String s1 = "자바";
	String s2 = new String("자바");
	System.out.println("s1="+s1+" s2="+s2);
	
	if(s1 == s2){	// 주소값을 비교
		System.out.println("같은 주소");
	}else{
		System.out.println("다른 주소");
	}
	if(s1.equals(s2)){ 	// 값을 비교
		System.out.println("같은 값");
	}else{
		System.out.println("다른 값");
	}
	
	// Object ob = new String("jsp"); 업캐스팅
	if("java".equals(new String("jsp"))){}
	
	// Object ob = new Integer(30); 박싱 + 업캐스팅
	if(new Integer(30).equals(new Integer(30))){}
		
	// Object ob = 30; 오토박싱 + 업캐스팅
	if(new Integer(30).equals(30)){}
	
	
	
	
// 참조형(배열)
	int[] ar = {10,20,30};
	String[] name = {"홍길동"};
	System.out.println("name="+name[0]);
	
// 참조형(인터페이스) : 자료구조
//	List li = new List();
	List al =  new ArrayList();
	al.add(30);
	al.add(3.14);
	al.add(true);
	al.add('j');
	al.add("자바");
	
	System.out.println(al);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
