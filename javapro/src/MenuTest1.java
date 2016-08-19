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
		file = new Menu("파일");
		edit = new Menu("편집");
		view = new Menu("보기");
		helpMenu = new Menu("도움말");

		open = new MenuItem("열기");
		save = new MenuItem("저장");
		print = new MenuItem("인쇄");
		exit = new MenuItem("종료");

		textA = new TextArea();

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

		// 프레임의 메뉴로 bar 객체를 할당
		f.setMenuBar(bar);
		f.add(textA, "Center");
		f.setSize(500, 300);
		f.setLocation(500, 200);
		f.setVisible(true);

		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}// 생성자 end

	public void actionPerformed(ActionEvent ae) {

		// 열기 메뉴아이템을 선택할때 이벤트 처리하는 부분
		if (ae.getSource() == open) {	// 열기

			// 입력을 받아들이는 변수선언
			FileReader file = null;
			int inputValue = 0;
			String content = "";

			// 파일 다이얼로그 생성
			FileDialog openFile = new FileDialog(f, "열기", FileDialog.LOAD);
			openFile.setVisible(true);

			// 열려고 하는 파일의 경로 및 파일명을 구하는 변수
			String dir = openFile.getDirectory() + openFile.getFile();

			try {
				file = new FileReader(dir);

				System.out.println( dir );

				// file의 끝을 만날 때까지 데이터를 읽어 들임
				while ((inputValue = file.read()) != -1) {
					content += (char) inputValue;
				} // end while

				textA.setText(content);

				// stream을 닫음
				file.close();

			} catch (Exception e) {
				System.out.println(e.toString());
			}

			// 저장 메뉴아이템을 선택할때 이벤트 처리하는 부분
		} else if (ae.getSource() == save) { //저장

			FileDialog saveFile = new FileDialog(f, "저장", FileDialog.SAVE);
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

		} else if (ae.getSource() == exit) { //종료
			// f.dispose();
			System.exit(0);
		}

	} // actionperformed end

	public static void main(String[] args) {
		MenuTest1 mt = new MenuTest1();
	}
}
