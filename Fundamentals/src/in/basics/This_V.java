package in.basics;

//constructor chaining: calling one constructor from another
//constructor
class X{
	X(){
		System.out.println("no-arg constructor called");
	}
	
	X(int a){
		 this();
		System.out.println("one-arg constructor called");
		
		
	}
	
	
}
public class This_V {

	public static void main(String[] args) {
		X obj = new X(10);

	}

}
