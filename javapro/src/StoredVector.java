import java.util.*;

public class StoredVector {
    public static void main( String[] args ) {
    
        // Vector ��ü ����
        Vector v = new Vector( 1, 1 );
        
        // Vector�� ��ü ����
        v.add( "gemini" );
        v.addElement( new Integer(10) );
        v.addElement( "johnharu" );
        v.addElement( "gracedew" );

		System.out.println(v);
        
        // Vector�� ����� ��ü�� ������ ����
        int length = v.size();
        
        // ó������ ���������� ��ü�� ����
        for ( int i=0; i<length; i++ ) {
            System.out.println( v.get(i) );
        }
        
        System.out.println( v.firstElement() );
        System.out.println( v.indexOf( "johnharu" ) );
        System.out.println( v.isEmpty() );
        
        // �ε����� 2�� ��ü�� ����
        v.remove( 2 );
        System.out.println( v.elementAt( 2 ));
        
        //�ε����� 2�� ��ü ���� "park"�� ����
        v.set( 2, "park" );
        System.out.println( v );
    }
}
        
        
             
        