class Point002D{
  protected int x=10; //Point3D���� �ٽ� �ѹ� ���ǵǹǷ� ���� ������ ��
  protected int y=20; //���� ������ ������ ������� ��
}
class Point003D extends Point002D{
  protected int x=40; //���� Ŭ������ �����ϴ� ��������� 
  protected int y=50; //���� Ŭ������ �ٽ� �� �� ������

  protected int z=30;
  public void print(){
    System.out.println(  x  +", "+y+", "+z);   //x�� y�� �� ���ǵ� Point3D Ŭ���� �Ҽ�
  }
}

class SuperTest03{
  public static void main(String[] args){
    Point003D pt=new Point003D();
    pt.print();
  }
}          