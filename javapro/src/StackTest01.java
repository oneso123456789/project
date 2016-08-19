import java.util.Stack;

public class StackTest01 {
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push("1-ÀÚ¹Ù");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");

//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());
//		System.out.println(myStack.pop());		
		
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}
