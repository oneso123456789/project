package packTest.packOne;

public class  AccessTest {  //�ٸ� ��Ű������ ������ ����� �������� pubic���� 
  private int    a=10;   //[1] private           
  int            b=20;  //[2] �⺻ ���� ������
  protected  int c=30;  //[3] protected        
  public     int d=40;  //[4] public       

  public void print( ){
    System.out.println("AccessTest�� print");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
