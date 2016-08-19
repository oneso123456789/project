class AirCon {

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
	
}
