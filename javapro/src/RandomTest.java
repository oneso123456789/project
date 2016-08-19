import java.io.InputStream;
import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		Scanner sc = new Scanner(is);		

		Random r = new Random();
		int it0 = r.nextInt(10);// 0 ~ 9
//		System.out.println("난수="+it0);
		
		int it1 = r.nextInt(45)+1; // 1 ~ 45
//		System.out.println("난수="+it1);		
		
		int num[] = new int[6];

		for (int i = 0; i < num.length; i++){

			num[i] = r.nextInt(45)+1; // 1 ~ 45	
// num[0]=10;	num[1]=10;	
			
			 for (int j = 0; j < i; j++){	
				 if (num[i] == num[j]){
					i--;	
					break;
				}// if end
			 }// for end			

		}// for end

		for (int k = 0; k < num.length; k++){
			System.out.print(num[k] + "  ");
		}
		
		
		
		
		
	}

}
