package in.basics;

public class Vehicle {
	  int a;
//	  Vehicle v2;
       Vehicle() {
    	System.out.println("Vehicle object created");
    	
    }
	
	
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
        System.out.println(v1.a);
//        System.out.println(v1.v2);
        
	}

}
