import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 3. Calendar
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();	
		
		GregorianCalendar c1=new GregorianCalendar();		
		Calendar c2 = new GregorianCalendar();// ��ĳ����
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;//0~11
		int d = c.get(Calendar.DATE);
		
		int ap = c.get(Calendar.AM_PM);//����(0),����(1)
		int h1 = c.get(Calendar.HOUR);// 12�ð���
		int h2 = c.get(Calendar.HOUR_OF_DAY);//24�ð���
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		System.out.println(y+"��"+m+"��"+d+"��");
		if(ap == 0){
			System.out.print("����");
		}else{
			System.out.print("����");
		}
		System.out.println(h1+"��");
		System.out.println(h2+":"+mm+":"+s);
	}

}



