public class RunnableTest implements Runnable {
	
    // 1���� 20���� ȭ�鿡 ��½�Ű�� �޼ҵ� 
    public void printNumber() {
		for( int i=1 ; i<=20 ; i++ ) {
			System.out.println( "number = " + i );
		}
    }    

    @Override
	public void run() {
		// TODO Auto-generated method stub
    	printNumber();
	}

	public static void main( String[] args ) {
		// ��ü ����
		RunnableTest tt = new RunnableTest();
		// Thread Ŭ���� ��ü ����
		Thread t = new Thread( tt );
		// Thread�� ���۽�Ŵ
		t.start();
		System.out.println( "--------> main thread end" );
    }
}
