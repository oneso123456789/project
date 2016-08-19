import java.awt.*;
import java.awt.event.*;

public class FileDialogTest implements ActionListener {
	private Frame f;
	private Button open, save;
	private FileDialog openFile, saveFile;

	public FileDialogTest() {
		// 프레임 생성
		f = new Frame("FileDialog");

		// 윈도우 종료 이벤트
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 버튼 생성후 버튼에 이벤트를 등록
		open = new Button("열기");
		save = new Button("저장");
		open.addActionListener(this);
		save.addActionListener(this);

		// 프레임에 버튼을 붙임
		f.setLayout(new FlowLayout());
		f.add(open);
		f.add(save);

		f.setSize(200, 100);
		f.setVisible(true);
	}// 생성자 end

	// 버튼에서 이벤트가 발생하면 호출되는 메소드
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == open) {
			openFile = new FileDialog(f, "열기", FileDialog.LOAD);
			openFile.setVisible(true);
		} else if (ae.getSource() == save) {
			// 파일 다이얼로그 생성
			saveFile = new FileDialog(f, "다른 이름으로 저장", FileDialog.SAVE);
			// 파일 다이얼로그를 화면에 보여줌
			saveFile.setVisible(true);
		}

	}

	public static void main(String[] args) {
		FileDialogTest ft = new FileDialogTest();
	}
}
