class StringTest00 {
	public static void main(String[] args) {
		String str1 = new String("Java Programming");
		String str2 = new String("Java Programming");

		if (str1 == str2) {// 주소값 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		String str3 = "Java Programming";
		String str4 = "Java Programming";
		if (str3 == str4) {// 주소값 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(str3.equals(str4)){	// 값을 비교
			System.out.println("같은 값");
		}else{
			System.out.println("다른 값");
		}
		
		
	}
}