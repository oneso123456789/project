abstract class ShapeClass{		// �߻� Ŭ����
	abstract void draw();		// �߻� �޼ҵ�
}

class Circ extends ShapeClass{
	void draw(){
		System.out.println("���� �׸���");
	}
}
class Rect extends ShapeClass{
	void draw(){
		System.out.println("�簢���� �׸���");
	}
}
class Tria extends ShapeClass{
	void draw(){
		System.out.println("�ﰢ���� �׸���");
	}
}

public class AbstractTest02{
	public static void main(String args[]){
		Circ c =  new Circ();
		Rect r = new Rect();
		Tria t=  new Tria();
	
		c.draw();
		r.draw();
		t.draw();
	}
}

