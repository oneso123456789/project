// Thread Ŭ������ ��ӹ޾� Thread�� ������.

public class Family extends Thread {
    Toilet toilet;
    String who;		// �ƹ���
    boolean key; // �ʱⰪ: false

    // ������
    public Family( String name, Toilet t ) {
		who = name;
		toilet = t;
    }
    
    public void run() {
		toilet.openDoor( who, key );
    }
}