public class ThrowsExceptionHandling1 {
	// occurException()�� ȣ���� ������ ����ó���� �絵 �ϰڴٴ� �ǹ�
	public void occurException() throws ArithmeticException{

		// ArithmethicException �߻�
		int result = 3 / 0;
		System.out.println(result);
	}
	public void occurEx() throws Exception{
		int[] a = {10,20,30};
		System.out.println(a[3]);
	}
	public static void main(String[] args) throws Exception{
		// ��ü�� ����
		ThrowsExceptionHandling1 te = new ThrowsExceptionHandling1();

		// try-catch ������� ���� ó��
		try {
			te.occurException();			
		} catch (Exception ae) {
			System.out.println("Exception�� �߻� : " + ae.toString());
			System.out.println("0���� ���� �� �����ϴ�.");
		} 
		try{
			te.occurEx();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Ҽ� ���� �迭 �Դϴ�");
		}
	}
}
