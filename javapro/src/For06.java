
public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 구구단 출력
		
		for(int dan=2; dan<=9; dan++){	// 단
			System.out.println("["+dan+"단]");
			
			for(int i=1; i<=9; i++)
			  System.out.println(dan+"*"+i+"="+dan*i);
			System.out.println();
		}		
		
	}

}
