import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class JTreeTest extends JFrame {

	// Ʈ���� ��尡 �� �����͸� Object �� �迭�� ����
	Object[] parent = { "����", "������", "����" };

	public JTreeTest() {

		// Object �� �迭�� Ʈ���� ������
		JTree tree = new JTree(parent);

		// ����� ���ڰ� �������� �ڵ����� ��ũ�ѹٰ� ���� �ǵ��� �ϴ� ����
		add(new JScrollPane(tree), "Center");

		setSize(200, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// ������ end

	public static void main(String[] args) {
		JTreeTest jt = new JTreeTest();
	}

}