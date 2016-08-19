public class ThreadPriority implements Runnable {

	public void run() {
		for (int i = 1; i < 21; i++) {
			// thread�� �̸��� ���� ���
			System.out.println(Thread.currentThread().getName() + " number = " + i);
		}
	}

	public static void main(String[] args) {

		ThreadPriority tl = new ThreadPriority();

		// ù��° Thread ����
		Thread first = new Thread(tl, "first1");
		// �ι�° Thread ����
		Thread second = new Thread(tl, "second1");
		// ����° Thread ����
		Thread third = new Thread(tl, "third1");

		// thread�� �켱������ ����ϴ� �κ�
		// ���α׷����� �켱 ������ �������� ������
		// �켱 ������ 5�� ��µ�
		// �ְ����(MAX_PRIORITY:10),
		// ���� ������(NORM_PRIORITY:5),
		// ��������(MIN_PRIORITY:1)
		System.out.println("first priority =" + first.getPriority());
		System.out.println("second priority =" + second.getPriority());
		System.out.println("third priority =" + third.getPriority());

	}
}
