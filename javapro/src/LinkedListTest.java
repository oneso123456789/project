import java.util.LinkedList;
import java.util.Queue;

class LinkedListTest {
	public static void main(String[] args) {

		Queue myQue = new LinkedList();
		// LinkedList myQue = new LinkedList();
		myQue.offer("1-�ڹ�");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");

//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());
//		System.out.println(myQue.poll());	null	
		
		while (myQue.peek() != null) // ť�� ������� �ʴٸ�
			System.out.println(myQue.poll()); // ť���� �����͸� �����´�.
	}
}