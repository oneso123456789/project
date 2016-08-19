
public class UseOverLoadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingTest ot = new OverLoadingTest();
		
		System.out.println(ot.addition( 3, 4 ));
		ot.addition( 3.0F, 4.0F );
		ot.addition( 3.14, 3.14 );
		ot.addition(new String("gemini"), "johnharu" );
	}

}
