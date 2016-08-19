import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Date
		
		SimpleDateFormat sd = 
	new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss EEE요일");
		
		Date d = new Date();
		System.out.println("Date0="+d);
		System.out.println("Date1="+sd.format(d));
		
		
// 2. Timestamp
		SimpleDateFormat sd1=
				new SimpleDateFormat("yyyy년 MM월 dd일");
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println("Time0="+ts);
		System.out.println("Time1="+sd.format(ts));
		System.out.println("Time2="+sd1.format(ts));
	}

}
