class GenericClass<T> {
  private T member;
  public void setValue(T value){
    member = value;
  }                                
   public T getValue( ){  
    return member;    
  }                
}
class GenericTest05{  
  public static void main(String[] args) { 
     GenericClass<Double> obj01=new GenericClass<Double>();
     obj01.setValue(3.4);
     System.out.println("�ǵ����� ����->" + obj01.getValue( ));

     GenericClass<Integer> obj02=new GenericClass<Integer>( );
     obj02.setValue(new Integer(10));
     System.out.println("�ǵ����� ����->" + obj02.getValue( ));

     GenericClass<String> obj03=new GenericClass<String>( );
     obj03.setValue("������ �� �ִ�.");
     System.out.println("�ǵ����� ����->" + obj03.getValue( ));
  }
}     