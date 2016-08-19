public class ThreadPriorityControl implements Runnable {

	public void run() {
		for (int i = 1; i < 1000; i++) {
			// thread�� �̸��� ���� ���
			System.out.println(Thread.currentThread().getName() + " number =" + i);
		}
	}

	public static void main(String[] args) {

		ThreadPriorityControl tl = new ThreadPriorityControl();

		// �ְ����(MAX_PRIORITY:10)
		// ���� ������(NORM_PRIORITY:5)
		// ��������(MIN_PRIORITY:1)

		// ù ��° Thread ����
		Thread first = new Thread(tl, "first1");
		// ��������(1)�� �����ϴ� �κ�
		first.setPriority(Thread.MIN_PRIORITY);
		System.out.println("first priority = " + first.getPriority());

		// �� ��° Thread ����
		Thread second = new Thread(tl, "second1");
		// �ְ����(10)�� �����ϴ� �κ�
		second.setPriority(Thread.MAX_PRIORITY);
		System.out.println("second priority = " + second.getPriority());

		// �� ��° Thread ����(�켱������ �������� ���� ���)
		Thread third = new Thread(tl, "third1");
		System.out.println("third priority = " + third.getPriority());

		first.start();
		second.start();
		third.start();
	}
}
