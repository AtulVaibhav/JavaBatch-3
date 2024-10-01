package in.basics;

public class Variable_I {
     int data=100;  //instance
	public static void main(String[] args) {
		Variable_I obj = new Variable_I();
		
		Variable_I obj2 = new Variable_I();
		
		// Access instance variable : objName. varName
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		
		obj.data = 500;
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
	}

}
