public class OverLoadingTest {
	
	// �޼ҵ� �����ε�
    public int addition( int a, int b ) {
		int hap = a + b;
		System.out.println( hap );
		return hap;
    }

    public void addition( float a, float b ) {
		float hap = a + b;
		System.out.println( hap );
    }

    public void addition( double a, double b ) {
		double hap = a + b;
		System.out.println( hap );
    }
	
    public void addition( String a, String b ) {
		String hap = a + b;
		System.out.println( hap );
    }
}
		