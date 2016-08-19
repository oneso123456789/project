import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileReader;
import java.io.FileWriter;

public class MenuTest1 implements ActionListener {
	private Frame f;
	private MenuBar bar;
	private Menu file, edit, view, helpMenu;
	private MenuItem open, save, print, exit;
	private MenuItem cut, paste, clear;
	private MenuItem help, info;
	private FileDialog openFile;
	private TextArea textA;

	public MenuTest1() {

		f = new Frame("Java Edit");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bar = new MenuBar();
		file = new Menu("����");
		edit = new Menu("����");
		view = new Menu("����");
		helpMenu = new Menu("����");

		open = new MenuItem("����");
		save = new MenuItem("����");
		print = new MenuItem("�μ�");
		exit = new MenuItem("����");

		textA = new TextArea();

		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(print);
		file.addSeparator();
		file.add(exit);

		edit.add(cut = new MenuItem("�߶󳻱�"));
		edit.add(paste = new MenuItem("�ٿ��ֱ�"));
		edit.add(clear = new MenuItem("�����"));

		helpMenu.add(help = new MenuItem("���� �׸�"));
		helpMenu.addSeparator();
		helpMenu.add(info = new MenuItem("Java Edit ����"));

		bar.add(file);
		bar.add(edit);
		bar.add(view);
		bar.add(helpMenu);

		// �������� �޴��� bar ��ü�� �Ҵ�
		f.setMenuBar(bar);
		f.add(textA, "Center");
		f.setSize(500, 300);
		f.setLocation(500, 200);
		f.setVisible(true);

		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}// ������ end

	public void actionPerformed(ActionEvent ae) {

		// ���� �޴��������� �����Ҷ� �̺�Ʈ ó���ϴ� �κ�
		if (ae.getSource() == open) {	// ����

			// �Է��� �޾Ƶ��̴� ��������
			FileReader file = null;
			int inputValue = 0;
			String content = "";

			// ���� ���̾�α� ����
			FileDialog openFile = new FileDialog(f, "����", FileDialog.LOAD);
			openFile.setVisible(true);

			// ������ �ϴ� ������ ��� �� ���ϸ��� ���ϴ� ����
			String dir = openFile.getDirectory() + openFile.getFile();

			try {
				file = new FileReader(dir);

				System.out.println( dir );

				// file�� ���� ���� ������ �����͸� �о� ����
				while ((inputValue = file.read()) != -1) {
					content += (char) inputValue;
				} // end while

				textA.setText(content);

				// stream�� ����
				file.close();

			} catch (Exception e) {
				System.out.println(e.toString());
			}

			// ���� �޴��������� �����Ҷ� �̺�Ʈ ó���ϴ� �κ�
		} else if (ae.getSource() == save) { //����

			FileDialog saveFile = new FileDialog(f, "����", FileDialog.SAVE);
			saveFile.setVisible(true);

			String dir = saveFile.getDirectory() + saveFile.getFile();
			String str = textA.getText();

			try {
				FileWriter fw = new FileWriter(dir + ".txt");
				System.out.print(str);
				// fw.write(str+".txt");
				fw.write(str);
				fw.close();

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		} else if (ae.getSource() == exit) { //����
			// f.dispose();
			System.exit(0);
		}

	} // actionperformed end

	public static void main(String[] args) {
		MenuTest1 mt = new MenuTest1();
	}
}
