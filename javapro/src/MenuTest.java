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

public class MenuTest implements ActionListener {
	private Frame f;
	private MenuBar bar;
	private Menu file, edit, view, helpMenu;
	private MenuItem open, save, print, exit;
	private MenuItem cut, paste, clear;
	private MenuItem help, info;
	private TextArea ta;
	private FileDialog openFile, saveFile;

	public MenuTest() {
		f = new Frame("Java Edit");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		ta = new TextArea();

		bar = new MenuBar();
		file = new Menu("����");
		edit = new Menu("����");
		view = new Menu("����");
		helpMenu = new Menu("����");

		open = new MenuItem("����");
		save = new MenuItem("����");
		print = new MenuItem("�μ�");
		exit = new MenuItem("����");

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

		f.setMenuBar(bar);
		f.add(ta, "Center");
		f.setSize(400, 200);
		f.setVisible(true);

		open.addActionListener(this);// ����
		save.addActionListener(this);// ����
		exit.addActionListener(this);// ����
	}// ������ end

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == open) {// ����
			openFile = new FileDialog(f, "����", 0);
			openFile.setVisible(true);
		} else if (e.getSource() == save) {// ����
			saveFile = new FileDialog(f, "�ٸ� �̸����� ����", FileDialog.SAVE);
			saveFile.setVisible(true);
		} else if (e.getSource() == exit) { // ����
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		MenuTest mt = new MenuTest();
	}
}
