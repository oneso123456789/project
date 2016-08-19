public class AirCon2 {

	String company;		// 멤버변수
	String color;		// White
	int price;			// 10000
	int size;			// 0
	int temp;			// 10
	
	void powerOn(){		// 메소드
		System.out.println("power on");
	}
	void powerOff(){
		System.out.println("power off");
	}
	void tempUp(){
		temp++;			// temp=11
	}
	void tempDown(){
		temp--;			// temp=10
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCon2 air = new AirCon2();
		
		air.color="White";
		air.temp=10;
		air.price=10000;
		
		air.tempUp();
		System.out.println("temp="+air.temp);
		System.out.println("color="+air.color);
		System.out.println("price="+air.price+"원");
		System.out.println();
		
		air.powerOn();
		air.powerOff();
		air.tempDown();
		System.out.println("temp="+air.temp);
		System.out.println("color="+air.color);
		System.out.println("price="+air.price+"원");
	}

}
