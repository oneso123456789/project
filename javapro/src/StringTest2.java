import java.util.StringTokenizer;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123-456-789-012";
		
		String[] ot = str.split("-");		
		for(int i=0; i<ot.length; i++){
			System.out.println(ot[i]);
		}
		
		StringTokenizer st = 
				new StringTokenizer(str, "-");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}		
		
	}

}
