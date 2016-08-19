public class PositionOverLoading {
	
    // String type, int type순으로 값을 받아들임
    public void printInfo( String name, int age ) {
		System.out.println( name + " : " + age );
    }

    // int type, String type 순으로 값을 받아들임
    public void printInfo( int age, String name ) {
		System.out.println( name + " : " + age );
    }
}
