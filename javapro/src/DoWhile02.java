
public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1, odd=0, even=0;			// �ʱⰪ
		do{
			if(i%2 == 1){		// Ȧ��
				odd+=i;
			}else{				// ¦��
				even+=i;
			}
			i++;						// ������
		}while(i<=100);					// ���ǽ�
		
		System.out.println("1~100 Ȧ���� ��="+odd);
		System.out.println("1~100 ¦���� ��="+even);
	}

}
