public class NoneObject {
    static int number;	//정적 멤버변수
    int a=10;
    
    public static void printNumber() {//정적 메소드
        System.out.println("number = " + number);
//      System.out.println(a);        
    }
    
// 정적 메소드 안에는 정적 필드만 사용가능하다.    
    
}            