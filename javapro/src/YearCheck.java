import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("������ �Է� �ϼ���?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		GregorianCalendar y = new GregorianCalendar();

		if (y.isLeapYear(year)) {// ���� true
			System.out.println(year + "�� �����Դϴ�");
		} else {
			System.out.println(year + "�� ����Դϴ�");
		}

	}

}
