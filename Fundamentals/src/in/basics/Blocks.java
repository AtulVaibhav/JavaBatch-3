package in.basics;

public class Blocks {
	static int data;
	// static block
	static {
		data = 300;
		System.out.println("static block executed");
	}
	// Instance initialization block
	
	{
		System.out.println("IIB executed");
		
	}
	
   public static void main(String[] args) {
	 System.out.println(Blocks.data);
	 Blocks b = new Blocks();
	 Blocks b2 = new Blocks();
}
}
