class Point0002D{						// �θ� Ŭ���� 
  protected int x=10; //���� ����
  protected int y=20; //Ȥ�� ������ ���� 
}
class Point0003D extends Point0002D{   // �ڽ� Ŭ����
  protected int x=40; //���� Ŭ������ �����ϴ� ��������� 
  protected int y=50; //���� Ŭ������ �ٽ� �� �� ������

  //super.x = 100;
//  System.out.println(super.x);
  
  protected int z=30;
  public void print(){
    System.out.println(  x  +", "+y+", "+z);   //x�� y�� �� ���ǵ� Point3D Ŭ���� �Ҽ�
  }
  public void print02(){
    System.out.println(super.x+", "+super.y+", "+z); //Point2D Ŭ���� �Ҽ� ��������� ����
  }
}

class SuperTest04{
  public static void main(String[] args){
    Point0003D pt=new Point0003D( );
    pt.print( );   //40, 50, 30 // Point3D�� x, y
    pt.print02( ); //10, 20, 30 // Point2D�� x, y
    
 //   System.out.println(super.x);
    
    
  }
}              