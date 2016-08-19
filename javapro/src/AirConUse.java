public class AirConUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirConUse ac =  new AirConUse();
		
		AirCon air = new AirCon();
		
		air.color="White";
		air.temp=10;
		air.price=10000;
		
		air.tempUp();
		System.out.println("temp="+air.temp);
		System.out.println("color="+air.color);
		System.out.println("price="+air.price+"¿ø");
		System.out.println();
		
		air.powerOn();
		air.powerOff();
		air.tempDown();
		System.out.println("temp="+air.temp);
		System.out.println("color="+air.color);
		System.out.println("price="+air.price+"¿ø");
		
	}

}
