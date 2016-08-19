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
		file = new Menu("파일");
		edit = new Menu("편집");
		view = new Menu("보기");
		helpMenu = new Menu("도움말");

		open = new MenuItem("열기");
		save = new MenuItem("저장");
		print = new MenuItem("인쇄");
		exit = new MenuItem("종료");

		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(print);
		file.addSeparator();
		file.add(exit);

		edit.add(cut = new MenuItem("잘라내기"));
		edit.add(paste = new MenuItem("붙여넣기"));
		edit.add(clear = new MenuItem("지우기"));

		helpMenu.add(help = new MenuItem("도움말 항목"));
		helpMenu.addSeparator();
		helpMenu.add(info = new MenuItem("Java Edit 정보"));

		bar.add(file);
		bar.add(edit);
		bar.add(view);
		bar.add(helpMenu);

		f.setMenuBar(bar);
		f.add(ta, "Center");
		f.setSize(400, 200);
		f.setVisible(true);

		open.addActionListener(this);// 열기
		save.addActionListener(this);// 저장
		exit.addActionListener(this);// 종료
	}// 생성자 end

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == open) {// 열기
			openFile = new FileDialog(f, "열기", 0);
			openFile.setVisible(true);
		} else if (e.getSource() == save) {// 저장
			saveFile = new FileDialog(f, "다른 이름으로 저장", FileDialog.SAVE);
			saveFile.setVisible(true);
		} else if (e.getSource() == exit) { // 종료
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		MenuTest mt = new MenuTest();
	}
}
