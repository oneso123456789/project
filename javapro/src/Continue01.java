
public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// continue�� : �ٽ� �ݺ������� ���ư���� �ǹ̷� ����
		
//		for(int i=1; i<=10; i++){
//			
//			if(i == 5) continue;
//			System.out.println("���="+i);
//		}

// 1 ~ 100 ���� ¦���� ���		
//		for(int i=1; i<=100; i++){
//			if(i%2 == 1) continue;   // Ȧ��
//			System.out.println("¦��="+i);
//		}
		
// 1 ~ 100 ���� 5�� ����� ���
		for(int i=1; i<=100; i++){
			if(i%5 != 0) continue;
			System.out.println("5�� ���="+i);
		}
		
		
	}

}
