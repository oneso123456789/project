// 1�� 365.242374
// ��� = 365�� (2���� - 28�ϱ���)
// ���� = 366�� (2���� - 29�ϱ���)

/* ������ ����

1. �ش� ������ 4�� ������ �������� ����

2. �� �߿��� 100���� ������ �������� ������ �ƴ�

3. �� �߿��� 400���� ������ �������� ����
*/

import java.util.Scanner;

public class YearCheck01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������ �Է��ϼ���?");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		if((y%4==0 && y%100!=0) || y%400==0){
			System.out.println(y+"�� ����");
		}else{
			System.out.println(y+"�� ���");
		}		
		
	}

}
