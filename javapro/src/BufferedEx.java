import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = 
	new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.print("원하는 단을 입력하세요?");
		
		try{
			String dan = br.readLine();//dan="5";
			int n = Integer.parseInt(dan);// n=5;
			
			for(int i=1; i<=9; i++)
				System.out.println(n+"*"+i+"="+n*i);
						
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
