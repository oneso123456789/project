import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// ����:�޸𸮻� �����͸� �����ϴ� ������	
// ���� ����� ���:  �ڷ��� ������ = ������;
		
// ������ ����	( ���� ���� : ���� ������ ����� )
	byte b = 10;
	short s = 100;
	int i = 1000;
	long l = 10000;
	System.out.println("b="+b);
	System.out.println("s="+s);
	System.out.println("i="+i);
	System.out.println("l="+l);
	System.out.println("b="+b+" s="+s+" i="+i+" l="+l);

// �Ǽ��� ����
	float ft = 3.14f;
	double d = 42.195;
	System.out.println("ft="+ft+" d="+d);
	System.out.printf("%.2f",d);// �Ҽ� 2°�ڸ����� ���
	System.out.println();
	
// ������ ����
	char c1 = 'j';
	char c2 = '��';
	System.out.println("c1="+c1+" c2="+c2);
	
// ���� ����
	boolean b1 = true;
	boolean b2 = false;
	System.out.println("b1="+b1+" b2="+b2);
	
// ������(Ŭ����)
	String s1 = "�ڹ�";
	String s2 = new String("�ڹ�");
	System.out.println("s1="+s1+" s2="+s2);
	
	if(s1 == s2){	// �ּҰ��� ��
		System.out.println("���� �ּ�");
	}else{
		System.out.println("�ٸ� �ּ�");
	}
	if(s1.equals(s2)){ 	// ���� ��
		System.out.println("���� ��");
	}else{
		System.out.println("�ٸ� ��");
	}
	
	// Object ob = new String("jsp"); ��ĳ����
	if("java".equals(new String("jsp"))){}
	
	// Object ob = new Integer(30); �ڽ� + ��ĳ����
	if(new Integer(30).equals(new Integer(30))){}
		
	// Object ob = 30; ����ڽ� + ��ĳ����
	if(new Integer(30).equals(30)){}
	
	
	
	
// ������(�迭)
	int[] ar = {10,20,30};
	String[] name = {"ȫ�浿"};
	System.out.println("name="+name[0]);
	
// ������(�������̽�) : �ڷᱸ��
//	List li = new List();
	List al =  new ArrayList();
	al.add(30);
	al.add(3.14);
	al.add(true);
	al.add('j');
	al.add("�ڹ�");
	
	System.out.println(al);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
