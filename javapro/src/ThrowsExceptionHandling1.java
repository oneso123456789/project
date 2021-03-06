public class ThrowsExceptionHandling1 {
	// occurException()를 호출한 곳으로 예외처리를 양도 하겠다는 의미
	public void occurException() throws ArithmeticException{

		// ArithmethicException 발생
		int result = 3 / 0;
		System.out.println(result);
	}
	public void occurEx() throws Exception{
		int[] a = {10,20,30};
		System.out.println(a[3]);
	}
	public static void main(String[] args) throws Exception{
		// 객체를 생성
		ThrowsExceptionHandling1 te = new ThrowsExceptionHandling1();

		// try-catch 블록으로 예외 처리
		try {
			te.occurException();			
		} catch (Exception ae) {
			System.out.println("Exception이 발생 : " + ae.toString());
			System.out.println("0으로 나눌 수 없습니다.");
		} 
		try{
			te.occurEx();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("사용할수 없는 배열 입니다");
		}
	}
}
