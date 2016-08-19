class StringTest01 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		
// 쓰레기 수집기능(Garbage Collection)		
		str1.toUpperCase(); // 메서드 호출 후에도
		System.out.println(str1); // str1의 내용은 수정되지 않는다.
	
		System.out.println(str1.toUpperCase());

		String str2 = str1.toUpperCase(); // 메소드의 처리 결과를 str2에 저장
		System.out.println(str2);		
		if(str1 == str2){
			System.out.println("같은 주소");
		}else{
			System.out.println("다른 주소");
		}
	}
}