public class ExplicitConversion {

    public static void main( String[] args ) {
    	
	// int�� ������ 97�� �ʱ�ȭ
	int intValue = 97;
	
	// char�� ������ int�� ���� ���� �Ҵ�
	char charValue = (char)intValue; // int -> char
	System.out.println( "charValue = " + charValue );

	// float�� ���� �ʱ�ȭ.
	float floatValue = 3.14F;
	
	// int�� ������ float�� ���� ���� �Ҵ�
	int intValue2 = (int)floatValue; // float -> int
	System.out.println( "intValue2 = " + intValue2 );

	// float�� ���� �ʱ�ȭ
	double doubleValue = 21.12345;
	
	// float�� ������ double�� ���� ���� �Ҵ�
	float floatValue2 = (float)doubleValue;//double->float
	System.out.println( "floatValue3 = " + floatValue2 );

	
	
	
	
    }
}