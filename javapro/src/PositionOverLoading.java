public class PositionOverLoading {
	
    // String type, int type������ ���� �޾Ƶ���
    public void printInfo( String name, int age ) {
		System.out.println( name + " : " + age );
    }

    // int type, String type ������ ���� �޾Ƶ���
    public void printInfo( int age, String name ) {
		System.out.println( name + " : " + age );
    }
}
