 interface IHello{
  public abstract void sayHello(String name);
}
interface IGoodBye{
  public abstract void sayGoodBye(String name);
}
//�� �������̽��κ��� ����� �޴� Ŭ���� ����
class SubClass implements IHello, IGoodBye{
  public void sayHello(String name){
     System.out.println(name+"�� �ȳ��ϼ���!");
  }
  public void sayGoodBye(String name){
     System.out.println(name+"�� �ȳ��� ������!");
  }
}
class AbstractTest05{
  public static void main(String[] args) {
    SubClass test= new SubClass();
    test.sayHello(args[0]);
    test.sayGoodBye(args[0]);
  }   
}         