//java.util.Vector;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
//javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNodeTest extends JFrame{

  public DefaultMutableTreeNodeTest(){

    //1. ��Ʈ ��� ����
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("�����ϴ� ��");

    //2. ������ root�� ��Ʈ ���� �ϴ� Ʈ�� ��ü�� �����Ͽ� 
    JTree tree = new JTree(root);
    add(new JScrollPane(tree),"Center");     //�����ӿ� ����

    //3. �θ� ��带 ���� 
    DefaultMutableTreeNode par01 = new DefaultMutableTreeNode("����");
    root.add(par01);                //��Ʈ ��忡 �߰�

    //4. �� ���� ���(����, �ʷ�, �Ķ�)�� �����Ͽ� 
    DefaultMutableTreeNode col01 = new DefaultMutableTreeNode("����");
    DefaultMutableTreeNode col02 = new DefaultMutableTreeNode("�ʷ�");
    DefaultMutableTreeNode col03 = new DefaultMutableTreeNode("�Ķ�");

	//5. ���� ��忡 ���δ�.
    par01.add(col01);  
    par01.add(col02);
    par01.add(col03);

	DefaultMutableTreeNode col01_01 = new DefaultMutableTreeNode("���ѻ���");
	DefaultMutableTreeNode col01_02 = new DefaultMutableTreeNode("���ѻ���");

	col01.add(col01_01);
	col01.add(col01_02);

    //��Ʈ ��忡 ���� �� �ٸ� �θ� ��带 ����
    DefaultMutableTreeNode par02 = new DefaultMutableTreeNode("������");
    root.add(par02);

    //�θ� ��忡 �ڽ� ��带 �߰��ϴ� �۾��� �ϰ�ó���ϱ� ���ؼ� ���� ��ü ����
	// Vector<String> vec = new Vector<String>(); String���� �����͸� ����
    Vector<DefaultMutableTreeNode> vec = new Vector<DefaultMutableTreeNode>();	

    //�ڽ� ��忡 ���� �����͸� �迭�� ����
    String[] data02 = {"�߱�", "�౸", "��", "����", "����"};
    
	//�ڽ� ��忡 ���� �������� ������ŭ �ݺ� �����ϸ鼭
    for(int i=0; i<data02.length; i++){ 

      //������ ��Ҹ� �߰��ϱ� ���ؼ� ��� ��ü ����
      vec.add(new DefaultMutableTreeNode(data02[i]));

      //������ ��带 ������ ��忡 ����
      par02.add(vec.get(i));

    }//for end

    //��Ʈ�� ���� ù ��° ��带 Ȯ���Ѵ�. 
//    tree.expandPath(new TreePath(par01.getPath()));

    setSize(200,300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
  }//������ end


  public static void main(String[] args) {
    DefaultMutableTreeNodeTest dmt = new DefaultMutableTreeNodeTest();
  }

}