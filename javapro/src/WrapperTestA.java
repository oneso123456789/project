class WrapperTestA {
  public static void main(String[] args) {
    int n01=10;
	int n02;
	Integer num01 ;  //Integer ��ü ����
    Integer num02= new Integer(20) ;	// �ڽ�
    
    num01 = n01;    			//���� �ڽ�
//	num01 = new Integer(n01);   // �ڽ�

    n02   = num02;				 //���� �� �ڽ�
//	n02   = num02.intValue();   // ��ڽ�

	System.out.println(n01 + ", " + num01);
	System.out.println(n02 + ", " + num02);
	
	
	if("java".equals("java")){	// ��ĳ����	
	}
	
	if(new Integer(30).equals(new Integer(30))){		
	}				// ��ĳ���� + �ڽ�
	
	if(new Integer(30).equals(30)){		
	}				// ��ĳ���� + ����ڽ�

  }    
}                                                                                           
