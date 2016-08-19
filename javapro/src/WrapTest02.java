
public class WrapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 박싱(boxing): Heap메모리를 한개의 박스로 생각하고
//               Stack메모리에 있는 데이터를 
//     		     Heap메모리로 복사하는 것.		         
// 언박싱(unboxing): Heap메모리의 데이터를 Stack메모리로
//		             복사하는 것.
		int n=10;	// 지역변수
		Integer num1 = new Integer(n);//박싱(boxing)
//		Integer num1 = n;//오토박싱(auto boxing)
		Integer num2 = new Integer("20");
		
		// 언박싱(unboxing)
		int n1 = num1.intValue(); //int n1 = 10;
		int n2 = num2.intValue(); //int n2 = 20;
		
		// 오토 언박싱
//		int n1 = num1; //int n1 = 10;
//		int n2 = num2; //int n2 = 20;
		
		System.out.println("n1+n2="+(n1+n2));
		
		System.out.println("2진수로="+Integer.toBinaryString(n1+n2));
		System.out.println("8진수로="+Integer.toOctalString(n1+n2));
		System.out.println("16진수로="+Integer.toHexString(n1+n2));
		
		System.out.println("max="+Integer.MAX_VALUE);
		System.out.println("min="+Integer.MIN_VALUE);
		
		
	}

}
