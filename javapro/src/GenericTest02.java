class TestClass02 {
	private Object member;

	public void setValue(Object value) {
		member = value;
	}
	public Object getValue() {
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass02 obj01 = new TestClass02();
		
		// Object value = new Integer(3); �ڽ� + ��ĳ����
		obj01.setValue(new Integer(3));//�ڽ�+��ĳ����
		System.out.println("�ǵ����� ����->" + obj01.getValue());
		Object ob01 = obj01.getValue();
		
		// �ٿ� ĳ���� + ��ڽ�
		int n01 = ((Integer)obj01.getValue()).intValue();
	
		// Object value = new Double(3.4);�ڽ�+��ĳ����	
		obj01.setValue(new Double(3.4));
		System.out.println("�ǵ����� ����->" + obj01.getValue());
		Object ob02 = obj01.getValue();
		
		// �ٿ� ĳ���� + ��ڽ�
		double n02=((Double)obj01.getValue()).intValue();
		
		
		// Object value=new String("������ �� �ִ�."); 
		obj01.setValue(new String("������ �� �ִ�."));
		System.out.println("�ǵ����� ����->" + obj01.getValue());
		Object ob03 = obj01.getValue();
		
		// �ٿ� ĳ����
		String str = (String)obj01.getValue();		
	}
}
