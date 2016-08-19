public class ExplicitConversion {

    public static void main( String[] args ) {
    	
	// int형 변수를 97로 초기화
	int intValue = 97;
	
	// char형 변수에 int형 변수 값을 할당
	char charValue = (char)intValue; // int -> char
	System.out.println( "charValue = " + charValue );

	// float형 변수 초기화.
	float floatValue = 3.14F;
	
	// int형 변수에 float형 변수 값을 할당
	int intValue2 = (int)floatValue; // float -> int
	System.out.println( "intValue2 = " + intValue2 );

	// float형 변수 초기화
	double doubleValue = 21.12345;
	
	// float형 변수에 double형 변수 값을 할당
	float floatValue2 = (float)doubleValue;//double->float
	System.out.println( "floatValue3 = " + floatValue2 );

	
	
	
	
    }
}