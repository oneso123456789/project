class StringTest00 {
	public static void main(String[] args) {
		String str1 = new String("Java Programming");
		String str2 = new String("Java Programming");

		if (str1 == str2) {// �ּҰ� ��
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		String str3 = "Java Programming";
		String str4 = "Java Programming";
		if (str3 == str4) {// �ּҰ� ��
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if(str3.equals(str4)){	// ���� ��
			System.out.println("���� ��");
		}else{
			System.out.println("�ٸ� ��");
		}
		
		
	}
}