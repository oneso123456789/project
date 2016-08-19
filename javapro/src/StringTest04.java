import java.util.StringTokenizer;

class StringTest04 {

	public static void main(String[] args) {
		
		StringTokenizer str = 
new StringTokenizer("전도연#김혜수#전지현#김태희", "#");

//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
//		System.out.println(str.nextToken());
		
		// 파싱된 문자열이 모두 몇 개인지 되는지 알려줌
		int cnt = str.countTokens();
		System.out.println("파싱할 문자열의 총갯수-> " + cnt);
//
//		System.out.println(str.nextToken());
		while (str.hasMoreTokens()) { // 토큰이 있으면
			System.out.println(str.nextToken());// 차례대로 파싱된 문자열을 얻어온다.
		}

	} // main() end

}