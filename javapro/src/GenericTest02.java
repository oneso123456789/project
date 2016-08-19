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
		
		// Object value = new Integer(3); 박싱 + 업캐스팅
		obj01.setValue(new Integer(3));//박싱+업캐스팅
		System.out.println("되돌리는 값은->" + obj01.getValue());
		Object ob01 = obj01.getValue();
		
		// 다운 캐스팅 + 언박싱
		int n01 = ((Integer)obj01.getValue()).intValue();
	
		// Object value = new Double(3.4);박싱+업캐스팅	
		obj01.setValue(new Double(3.4));
		System.out.println("되돌리는 값은->" + obj01.getValue());
		Object ob02 = obj01.getValue();
		
		// 다운 캐스팅 + 언박싱
		double n02=((Double)obj01.getValue()).intValue();
		
		
		// Object value=new String("이해할 수 있다."); 
		obj01.setValue(new String("이해할 수 있다."));
		System.out.println("되돌리는 값은->" + obj01.getValue());
		Object ob03 = obj01.getValue();
		
		// 다운 캐스팅
		String str = (String)obj01.getValue();		
	}
}
