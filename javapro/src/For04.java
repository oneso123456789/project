
public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int odd=0, even=0;
		for(int i=1; i<=100; i++){
			if(i % 2 == 1){		// È¦¼ö
				odd += i;
			}else{				// Â¦¼ö
				even += i;
			}
		}
		System.out.println("1~100 È¦¼öÀÇ ÇÕ="+odd);
		System.out.println("1~100 Â¦¼öÀÇ ÇÕ="+even);
	}

}
