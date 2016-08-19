
public class WrapTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double num1 = new Double(3.14);// ¹Ú½Ì
		Double num2 = new Double("42.195");
		
		double d1 = num1.doubleValue();//¾ð¹Ú½Ì
		double d2 = num2.doubleValue();//¾ð¹Ú½Ì
		
		System.out.println("d1+d2="+ (d1+d2));
		
		// String("1234.567")  ---> double(1234.567) 
		double d = Double.parseDouble("1234.567");
		
		
 	}

}
