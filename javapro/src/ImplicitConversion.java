public class ImplicitConversion {

    public static void main( String[] args ) {
    	
	// char ���� ���� �� �ʱ�ȭ.
	char charValue = 'a';
	System.out.println( "charValue = " + charValue );
 
	// int ���� ���� �� 'a'�� ������ �ʱ�ȭ.
//	int intValueOfChar = charValue;
    int intValueOfChar = 'a';	// char -> int
	System.out.println( "intValueOfChar = " + intValueOfChar );

	// int ���� ���� �� �ʱ�ȭ.
	int intValue = 30;
	System.out.println( "intValue = " + intValue );

	// float ���� ���� �� intValue ���� �� �Ҵ�
	float floatValue = intValue; // int -> float
	System.out.println( "floatValue = " + floatValue );

	// double ���� ����� floatValue,intValue ���� �� �Ҵ�
	double doubleValue1 = floatValue;// float -> double
	double doubleValue2 = intValue;  // int -> double
	System.out.println("doubleValue1 ="+doubleValue1);
	System.out.println("doubleValue2 ="+doubleValue2);

    }//main end
}//class end



