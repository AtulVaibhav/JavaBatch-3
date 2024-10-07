package in.basics;

class VehicleData{
	VehicleData(){
		System.out.println("current value of this --->"+this);
	}
}


public class This_I {

	public static void main(String[] args) {
		VehicleData v = new VehicleData();
		System.out.println("current value of v :"+v);
		
		System.out.println("____________________");
		VehicleData v2 = new VehicleData();
		System.out.println("current value of v2 :"+v2);
	}

}
