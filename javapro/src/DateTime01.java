import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 3. Calendar
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();	
		
		GregorianCalendar c1=new GregorianCalendar();		
		Calendar c2 = new GregorianCalendar();// 업캐스팅
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;//0~11
		int d = c.get(Calendar.DATE);
		
		int ap = c.get(Calendar.AM_PM);//오전(0),오후(1)
		int h1 = c.get(Calendar.HOUR);// 12시간제
		int h2 = c.get(Calendar.HOUR_OF_DAY);//24시간제
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		System.out.println(y+"년"+m+"월"+d+"일");
		if(ap == 0){
			System.out.print("오전");
		}else{
			System.out.print("오후");
		}
		System.out.println(h1+"시");
		System.out.println(h2+":"+mm+":"+s);
	}

}



