import java.util.StringTokenizer;

class StringTest04 {

	public static void main(String[] args) {
		
		StringTokenizer str = 
new StringTokenizer("������#������#������#������", "#");

//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
		
		// �Ľ̵� ���ڿ��� ��� �� ������ �Ǵ��� �˷���
		int cnt = str.countTokens();
		System.out.println("�Ľ��� ���ڿ��� �Ѱ���-> " + cnt);
//
//		System.out.println(str.nextToken());
		while (str.hasMoreTokens()) { // ��ū�� ������
			System.out.println(str.nextToken());// ���ʴ�� �Ľ̵� ���ڿ��� ���´�.
		}

	} // main() end

}