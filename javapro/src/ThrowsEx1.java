public class ThrowsEx1 {
						// String n="5";
	public void setData(String n) throws NumberFormatException {
		if (n.length() >= 1) {
			String str = n.substring(0, 1);//str="5"
			printData(str);
		}
	}
						// String n="5";
	private void printData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);// dan=5;
		System.out.println(dan + "단");
		System.out.println("-----------");
		for (int i = 1; i < 10; i++)
			System.out.println(dan + "*" + i + "=" + (dan * i));
	}

	public static void main(String[] args) {
		ThrowsEx1 t1 = new ThrowsEx1();

		try {	    // args[0] = "5";
			t1.setData(args[0]);
		} catch (Exception e) {
			System.out.println("첫문자가 숫자가 아닙니다.");
		}
	}// main() end

}
