import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 3.Calendar
		
	//	Calendar c2 = new Calendar();
		
	//	Calendar c1 = new GregorianCalendar();//��ĳ����
		
		Calendar c = Calendar.getInstance();
		
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1;// 0~11
		int d = c.get(Calendar.DATE);
		
		int h1 = c.get(Calendar.HOUR);	// 12�ð�
		int ap = c.get(Calendar.AM_PM);	//0:����	
									    //1:����
		int h2 = c.get(Calendar.HOUR_OF_DAY); //24�ð�
		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);
		
		System.out.println(y+"�� "+ m+"�� "+d+"��");
		if(ap == 0){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		System.out.println(h1+":"+mm+":"+s);		
		
		int w = c.get(Calendar.DAY_OF_WEEK);//1~7
		System.out.println("w="+w);
		// 1:��, 2:��, 3:ȭ, 4:��, 5:��, 6:��, 7:��
		String[] week={"��","��","ȭ","��","��","��","��"};
//	week[0]="��"	, week[1]="��"	, week[2]="ȭ"	
//  week[3]="��"	, week[4]="��"	, week[5]="��"	
//  week[6]="��"				
				
		System.out.println(week[w-1]+"����");
	}

}
