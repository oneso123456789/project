  public class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;	// args[0] = "10";

		try{// int data = 10;
			int data = Integer.parseInt(args[0]);
		
			System.out.println(var/data);
		
		// Exception ���� Ŭ������ ���� ���� Ŭ�������� 
		// ��� ������ �ֱ� ������ ���� �����ؼ��� �ȵȴ�.
				
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴմϴ�.");
		}catch(ArithmeticException ae){
			System.out.println("0���� ������ ����?");
		}catch(Exception e){ 
			System.out.println("Exception !!");	
		}
			System.out.println("���α׷� ����!");		
	}
  }
