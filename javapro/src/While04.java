
public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan=2, i;
		
		while(dan<=9){		// ��
			System.out.println("["+dan+"��]");
			i=1;
			while(i<=9){
			 System.out.println(dan+"*"+i+"="+dan*i);
			 i++;
			}
			
			System.out.println();
//			i=1;
			dan++;
		}
		
	}

}
