public class IndexOfTest {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

		int index1 = message.indexOf('a');
		int index2 = message.indexOf(65);

		System.out.println(index1);
		System.out.println(index2);

		// index��ȣ 13��° ���Ŀ��� a��ã��
		int index3 = message.indexOf('a', 13);
		System.out.println(index3);

		int index4 = message.indexOf("av");
		System.out.println(index4);

		int index5 = message.indexOf("man", 12);
		System.out.println(index5);

		int index6 = message.indexOf("java");
		System.out.println(index6);
	}
}
