public class AppendStringBuffer {
	public static void main(String[] args) {

		// StringBuffer ��ü ����
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1 = " + sb1);

		// StringBuffer sb1�� ���ڿ��� �߰��� ���ο� ��ü ����
		StringBuffer sb2 = sb1.append(" is beautiful");
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 = " + sb1);
		if(sb1 == sb2){
			System.out.println("���� �ּ�");
		}else{
			System.out.println("�ٸ� �ּ�");
		}		
		
		// ������ ����Ÿ ���� �߰�
		System.out.println(sb1.append(1004));
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		String str = new String(sb1); // StringBuffer�� String���� ��ȯ
		System.out.println(str.toUpperCase());

	
	}
}
