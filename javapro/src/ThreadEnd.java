public class ThreadEnd extends Thread {

    @Override
	public void run() {
		// TODO Auto-generated method stub
		// thread�� ���۵Ǹ� ����Ǵ� ����
		for( int i=1 ; i<=20 ; i++ ) {
			System.out.println( "run number = " + i );
		}
	}

	public static void main( String[] args ) {		
		ThreadEnd tt = new ThreadEnd();
		// thread�� �����Ŵ
		tt.start();
		
		// main()������ ȭ�鿡 101���� 120���� ���
		for( int i=101 ; i<=120 ; i++ ) {
			System.out.println( "-------> main number = " + i );
		}
    }

}
