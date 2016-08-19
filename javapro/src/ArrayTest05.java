
public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 확장 for문
// for(int s : 배열변수 )
		
		int[] score = {95, 71, 84, 93, 87};
		int sum=0;
		
		for(int s : score){
			sum = sum + s;
		}
		System.out.println("총점="+sum);
		
		
		
		
	}

}
