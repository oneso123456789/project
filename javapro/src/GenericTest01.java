class TestClass {
	private int member;

	public void setValue(int value) {
		member = value;
	}	
	public int getValue() {
		return member;
	}
}

class GenericTest01 {
	public static void main(String[] args) {
		TestClass obj01 = new TestClass();
		obj01.setValue(3);
		System.out.println("�ǵ����� ����->" + obj01.getValue());
		
		obj01.setValue(3.4);
		System.out.println("�ǵ����� ����->" + obj01.getValue());
		
		obj01.setValue(new String("������ �� �ִ�."));
		System.out.println("�ǵ����� ����->" + obj01.getValue());
	}
}
