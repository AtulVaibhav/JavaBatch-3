package in.basics;

class Transport{
	String typeOfTransport;
	int speed;
	
	Transport(String typeOfTransport,int speed){
		this.typeOfTransport = typeOfTransport;
		this.speed = speed;
	}
	
	
	public void getType() {
		System.out.println(this.typeOfTransport);
		this.getSpeed();
	}
	
	public void getSpeed() {
		System.out.println(this.speed);
	}
	
	
}


public class This_IV {

	public static void main(String[] args) {
		Transport car = new Transport("Car", 120);
		Transport train = new Transport("Train", 320);
		Transport flight = new Transport("Flight", 700);
		
		//train.getType();
	    //flight.getType();
		car.getType();
		
		

	}

}
