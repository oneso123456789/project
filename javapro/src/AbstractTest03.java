abstract class Hello{	//�߻� Ŭ����
  public abstract void sayHello(String name);//�߻�޼ҵ�
}
abstract class GoodBye{ //�߻� Ŭ����
  public abstract void sayGoodBye(String name);//�߻�޼ҵ�
}
// Ŭ������ ���߻���� ������� �ʴ´�.
class SubClass03 extends GoodBye{
  public void sayHello(String name){
      System.out.println(name+"�� �ȳ��ϼ���!");
  }
  public void sayGoodBye(String name){
      System.out.println(name+"�� �ȳ��� ������!");
  }
}
class AbstractTest03{
   public static void main(String[] args) {
     SubClass03 test= new SubClass03();
     test.sayHello("ȫ�浿");
     test.sayGoodBye("ȫ�浿");
   }   
}                                                       
