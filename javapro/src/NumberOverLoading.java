public class NumberOverLoading {

    // argument 하나를 받아 들여서 합을 구하는 method
    public void addition( int a ) {
		int hap = a + 10; 
		System.out.println( hap );
    }
    // argument 두개를 받아 들여서 합을 구하는 method
    public void addition( int a, int b ) {
		int hap = a + b;
		System.out.println( hap );
    }
    // argument 세개를 받아 들여서 합을 구하는 method
    public void addition( int a, int b, int c ) {
		int hap = a + b + c;
		System.out.println( hap );
    }
    // argument 네개를 받아 들여서 합을 구하는 method
    public void addition( int a, int b, int c, int d ) {
		int hap = a + b + c + d;
		System.out.println( hap );
    }
}
