import java.util.*;

public class VectorTest01 {
  public static void main(String[] args) {

    //4���� ��Ҹ� ������ �� �ִ� ���� ��ü ����, 3���� ����   
    Vector vec =  new Vector(4, 3);  
    System.out.println("������ ũ��� " + vec.size());    //���Ϳ� ����� ����� ������ �˷���
    System.out.println("������ �뷮�� " + vec.capacity());//������ �뷮�� ��ȯ    
	
    for(int i=0; i<5; i++)
      vec.add(i*10);     
    System.out.println("������ ũ��� " + vec.size());  
    System.out.println("������ �뷮�� " + vec.capacity());      
    System.out.println("ù ��° ��Ҵ� " + vec.firstElement());
    System.out.println("�� ��° ��Ҵ� " + vec.get(1));  //0�� ù ��° ����̹Ƿ�
    System.out.println("������ ��Ҵ� " + vec.lastElement());  

   System.out.println("\n >> ����� ��� ��ü ��� <<" );  

   for(int i=0; i<vec.size(); i++)
     System.out.print("   " + vec.get(i));
   System.out.println();
  }    
}