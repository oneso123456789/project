class StringTest01 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		
// ������ �������(Garbage Collection)		
		str1.toUpperCase(); // �޼��� ȣ�� �Ŀ���
		System.out.println(str1); // str1�� ������ �������� �ʴ´�.
	
		System.out.println(str1.toUpperCase());

		String str2 = str1.toUpperCase(); // �޼ҵ��� ó�� ����� str2�� ����
		System.out.println(str2);		
		if(str1 == str2){
			System.out.println("���� �ּ�");
		}else{
			System.out.println("�ٸ� �ּ�");
		}
	}
}