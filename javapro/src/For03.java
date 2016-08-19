
public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int odd=0, even=0;
		for(int i=1; i<=100; i=i+2){	// È¦¼ö
			odd += i;		// odd = odd + i;			
		}
		for(int i=0; i<=100; i=i+2){	// Â¦¼ö
			even += i;		// even = even + i;
		}
		System.out.println("1~100 È¦¼öÀÇ ÇÕ="+odd);
		System.out.println("1~100 Â¦¼öÀÇ ÇÕ="+even);		
	}

}
