import java.text.DecimalFormat;

class StaticTest07 {
  public static void main(String[] args)  {

    int r=5;
	double l;      //����(���ѷ�)
    double s;      //���� ����
	double v1;     //���� ǥ����
	double v;      //���� ü��(����)

	l=2*r*Math.PI;
    s=r*r*Math.PI;
	v1=4*Math.PI*r*r;
	v=4/3*Math.PI*r*r*r; // Math.pow(r,3)

	DecimalFormat df = new DecimalFormat("###.00");
		
	System.out.println("���� : " + l);
    System.out.println("�������� "+r+"�� ���� ���� "+ s);
	System.out.println("���� ǥ���� : " + v1);
	System.out.println("���� ü�� :" + v);	
	System.out.println();
	
	System.out.println("���� : " + df.format(l));
    System.out.println("�������� "+r+"�� ���� ���� "+ df.format(s));
	System.out.println("���� ǥ���� : " + df.format(v1));
	System.out.println("���� ü�� :" + df.format(v));
	System.out.println();
	
//	System.out.printf("%f", l);
	System.out.printf("%.2f", l);
	System.out.println();
	System.out.format("%.2f", l);
  }
}