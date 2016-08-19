
public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] data = {9.5, 7.0, 13.6, 7.5, 10.0};
		double max, min;
		max=data[0]; // 9.5
		min=data[0]; // 9.5
		
		for(int i=1; i<5; i++){
			if(data[i] > max) 
				max=data[i];
			if(data[i] < min) 
				min=data[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
