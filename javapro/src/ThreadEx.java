import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Date d = new Date();
			SimpleDateFormat sd = 
			new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ HH:mm:ss");

			System.out.println(sd.format(d));
			
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx te = new ThreadEx();
		Thread t = new Thread(te);
		t.start();
	}

}
