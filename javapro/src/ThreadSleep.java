public class ThreadSleep implements Runnable {

	public void run() {
		for (int i = 1; i < 10; i++) {
			// ���� CPU�� ������ Thread ���
			System.out.println(Thread.currentThread().getName() + " : " + i);

			try {
				// sleep() �޼ҵ带 ����� ���α׷��Ӱ� ������
				// block ���·� ����.
				// 1�� ���� thread�� block ���¿� ��Ʈ��
				Thread.sleep(1000); // (����: 1/1000 ��)
			} catch (InterruptedException ie) {
				System.out.println(ie.toString());
			}
		} // for end
	}// run() end

	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();

		// �� ���� Thread�� �������� �����Ŵ
		// 2���� Thread�� ������ �켱 ������ �����.(5�� ����)
		Thread first = new Thread(ts, "first1");
		Thread second = new Thread(ts, "second1");
		first.start();
//		second.start();
	}
}
