
public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1~100���� Ȧ��, ¦���� �ձ��ϱ�

		int i=1, odd=0, even=0;		// �ʱⰪ
		while(i<=100){				// ���ǽ�
			if(i%2 == 1){	// Ȧ��
				odd+=i;
			}else{			// ¦��
				even+=i;
			}
			i++;					// ������
		}		
		System.out.println("1~100 Ȧ���� ��="+odd);
		System.out.println("1~100 ¦���� ��="+even);
				
	}

}
