import java.awt.*;
import java.awt.event.*;

public class FileDialogTest implements ActionListener {
	private Frame f;
	private Button open, save;
	private FileDialog openFile, saveFile;

	public FileDialogTest() {
		// ������ ����
		f = new Frame("FileDialog");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ��ư ������ ��ư�� �̺�Ʈ�� ���
		open = new Button("����");
		save = new Button("����");
		open.addActionListener(this);
		save.addActionListener(this);

		// �����ӿ� ��ư�� ����
		f.setLayout(new FlowLayout());
		f.add(open);
		f.add(save);

		f.setSize(200, 100);
		f.setVisible(true);
	}// ������ end

	// ��ư���� �̺�Ʈ�� �߻��ϸ� ȣ��Ǵ� �޼ҵ�
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == open) {
			openFile = new FileDialog(f, "����", FileDialog.LOAD);
			openFile.setVisible(true);
		} else if (ae.getSource() == save) {
			// ���� ���̾�α� ����
			saveFile = new FileDialog(f, "�ٸ� �̸����� ����", FileDialog.SAVE);
			// ���� ���̾�α׸� ȭ�鿡 ������
			saveFile.setVisible(true);
		}

	}

	public static void main(String[] args) {
		FileDialogTest ft = new FileDialogTest();
	}
}
