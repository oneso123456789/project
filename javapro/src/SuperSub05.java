class Parent05{
  public void parentPrn( ){
     System.out.println("���� Ŭ���� : ParentPrn �޼���");  
  }
}
//Parent�� ���� Ŭ������ �ϴ� ���� Ŭ���� Child ���� 
class Child05 extends Parent05{
  //���� Ŭ������ �ִ� ParentPrn �޼��带 �������̵��ϸ� 
  //Child�� ����� ��ü�� ���� Ŭ������ �޼��尡 ���еǾ� ��� ���� ���ϰ� �ȴ�. 
//  public void parentPrn( ){ // �޼ҵ� �������̵�
//      super.parentPrn();
//	  System.out.println("���� Ŭ���� : ParentPrn �޼���");  
//  }
	
  @Override
	public void parentPrn() {
		// TODO Auto-generated method stub
//		super.parentPrn();
	  System.out.println("�޼ҵ� �������̵�");
	}

public void childPrn( ){
	  super.parentPrn();
	  System.out.println("���� Ŭ���� : ChildPrn �޼���");  
 }                                             
}

class SuperSub05{
  public static void main(String[] args){
    Child05 c = new Child05( );  	//���� Ŭ������ ��ü�� ����
    c.parentPrn();          	//�������̵��� ���� Ŭ������ �޼��� ȣ�� 
    c.childPrn();             	//���� Ŭ���� �ڱ� �ڽ��� �޼��� ȣ��
   
    System.out.println("-------------------------------------------->> ");  
    Parent05 p = new Parent05( );	//���� Ŭ������ ��ü�� ����
    p.parentPrn( );            	//���� Ŭ����(�ڱ� �ڽ�)�� �޼��� ȣ��
  }                                           
}                                                                                      
