import  packTest.packOne.AccessTest;

//AccessTest�� ���� Ŭ������ SubOne�� ����
class SubOne extends AccessTest {
  void subPrn( ){
    System.out.println(a); //[1. Sub] private -X
    System.out.println(b); //[2. Sub] �⺻ ���� ������-X
    System.out.println(c); //[3. Sub] protected -O
    System.out.println(d); //[4. Sub] public -0
  }
}

//AccessTest�� ��Ӱ��谡 ���� Ŭ���� 
class SuperSubA{
  public static void main(String[] args){
    AccessTest at=new AccessTest( );
    at.print( );
    System.out.println("main");
    System.out.println(at.a); //[1. main] private -X
    System.out.println(at.b); //[2. main] �⺻ ���� ������-X
    System.out.println(at.c); //[3. main] protected -X
    System.out.println(at.d); //[4. main] public -O
  }
}