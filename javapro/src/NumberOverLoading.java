public class NumberOverLoading {

    // argument �ϳ��� �޾� �鿩�� ���� ���ϴ� method
    public void addition( int a ) {
		int hap = a + 10; 
		System.out.println( hap );
    }
    // argument �ΰ��� �޾� �鿩�� ���� ���ϴ� method
    public void addition( int a, int b ) {
		int hap = a + b;
		System.out.println( hap );
    }
    // argument ������ �޾� �鿩�� ���� ���ϴ� method
    public void addition( int a, int b, int c ) {
		int hap = a + b + c;
		System.out.println( hap );
    }
    // argument �װ��� �޾� �鿩�� ���� ���ϴ� method
    public void addition( int a, int b, int c, int d ) {
		int hap = a + b + c + d;
		System.out.println( hap );
    }
}
