import java.awt.*; //java.awt.BorderLayout
import java.awt.event.*; //java.awt.ActionListener
import javax.swing.*; 
import javax.swing.border.*; //javax.swing.border.TitledBorder
import javax.swing.table.*; //javax.swing.table.DefaultTableModel

public class JTableTestEx extends JFrame implements ActionListener{
	JTable table;
	DefaultTableModel model;

	JTextField txt1 = new JTextField("",6);
	JTextField txt2 = new JTextField("",6);
	JTextField txt3 = new JTextField("",6);
	JTextField txt4 = new JTextField("",6);	
	JTextField delName = new JTextField("",6);

	JScrollPane sp;

	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel p8 = new JPanel();

	JButton btn;
	JButton delButton;

	int row_count=0, tot=0;
	double avg=0.0;
	String str_tot, str_avg;
	long long_avg;

	String colum[]={"��ȣ","�̸�","����","����","����","����","���"};

    public JTableTestEx(){
		super("JTable EX");
		model=new DefaultTableModel(colum,0);
		table=new JTable(model);
		table.setSelectionMode(0);//0:���� ����, 1:���߼���
		sp=new JScrollPane(table);			
	
		btn=new JButton("�߰�");
		delButton=new JButton("����");

		p.setLayout(new GridLayout(4,1));
		p.setBorder(new TitledBorder("�Է�"));
		p1.add(new JLabel("�̸�"));
		p1.add(txt1);
		p2.add(new JLabel("����"));
		p2.add(txt2);
		p3.add(new JLabel("����"));
		p3.add(txt3);
		p4.add(new JLabel("����"));
		p4.add(txt4);
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);

		p5.add(btn);

		p6.setLayout(new BorderLayout());
		p6.add(p, "Center");
		p6.add(p5, "South");
	  
		p7.setBorder(new TitledBorder("����"));
		p7.add(new JLabel("�̸�"));
		p7.add(delName);

		p8.setLayout(new BorderLayout());
		p8.add(p6, "North");
		p8.add(p7, "Center");
		p8.add(delButton, "South");
		
		add(p8, "West");
		add(sp, "Center");		

		setBounds(300, 300, 700, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(this);
		delName.addActionListener(this);
		delButton.addActionListener(this);
    }//������ end

	public void setChogi(){ //�ʱ�ȭ
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		txt4.setText("");
	}

	public boolean setCheck(){//����, ��� ���
		boolean b=true;
		row_count=table.getRowCount()+1;

		try{
				tot=Integer.parseInt(txt2.getText()) + Integer.parseInt(txt3.getText())+
					Integer.parseInt(txt4.getText());
					str_tot = String.valueOf(tot);
					avg=tot/3.0;
					long_avg=Math.round(avg);
					str_avg = String.valueOf(long_avg);
		}catch(NumberFormatException ne){
					JOptionPane.showMessageDialog(this,"���ڸ� �Է����ּ���");
					setChogi();
					b=false;
		}
			return b;
	}

	public void actionPerformed(ActionEvent e){
		Object o=e.getSource();

		if(o == btn){ //�߰���ư
			if((txt1.getText().equals(""))||(txt2.getText().equals(""))||
					(txt3.getText().equals(""))||(txt4.getText().equals(""))){
					JOptionPane.showMessageDialog(this,"�����͸� �Է��ϼ���");
			}else{
				if(setCheck()){
					String data[]={row_count+"", txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), str_tot, str_avg };
					 model.addRow(data);
					 setChogi();
				}
			}

		}else if(o == delName){ //����

				if(table.getRowCount() != 0){

					for(int i=0;i<table.getRowCount();i++){
						if(delName.getText().equals(table.getValueAt(i,1))){ //������ �̸��� ������ ����
				
							int ans =JOptionPane.showConfirmDialog(this,"������ �����Ͻðڽ��ϱ�?","����Ȯ��",JOptionPane.YES_NO_OPTION);
							if(ans==JOptionPane.YES_OPTION){
								model.removeRow(i);
								JOptionPane.showMessageDialog(this,"�����Ǿ����ϴ�.");
								delName.setText("");
							}					
						}

					}//for end
				}else{
					JOptionPane.showMessageDialog(this,"������ �����Ͱ� �����ϴ�.");
				}
			

		}else if(o == delButton){ //������ �����͸� ������ ������ư�� Ŭ���Ҷ�		
				int row = table.getSelectedRow();			
				if(row == -1){ //������ ���� �������� -1�� ��ȯ
					JOptionPane.showMessageDialog(this, "������ �����͸� ���� �ϼ���");
					return;
				}
				model.removeRow(row);					
		}

	}

	
	public static void main(String[] args){
	  JTableTestEx jt = new JTableTestEx();
	}

}



	