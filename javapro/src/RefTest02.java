class Parent02{						// �θ� Ŭ����
  public void parentPrn(){
     System.out.println("���� Ŭ���� : ParentPrn �޼���");  
  }
}
class Child02 extends Parent02{   // �ڽ� Ŭ����
  public void childPrn(){
     System.out.println("���� Ŭ���� : ChildPrn �޼���");  
 }                                             
}

class RefTest02{
  public static void main(String[] args){
  Parent02  p = new  Parent02();  
  Child02  c;                   
  //���� Ŭ������ ���۷��� ������ ���� Ŭ������ ���۷��� ���� �����ϸ�
  c = (Child02)p;   //�̸� DownCasting �̶��ϴµ� �����Ϸ� ������ �߻��Ѵ�. 
 
  c.parentPrn();   //2���� �޼ҵ� ��� ȣ�� �ȵ�.
  c.childPrn();
 }  
}       