import java.util.Date;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		// Stack ��ü ����
		Stack s = new Stack();
		System.out.println(s.empty());

		// Stack�� ���� ����
		s.push("gemini");
		Date d = new Date();
		s.push(d);
		s.push(new Integer(10));
		s.push("johnharu");

		// Stack�� ���� ���
		System.out.println(s.empty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.empty());
	}
}
