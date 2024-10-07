package in.basics;


class Y{
	static {
		System.out.println("static block executed");
	}
	{
		System.out.println("IIb executed");
	}
	Y(){
		System.out.println("constructor called");
	}
}
public class Query3 {

	public static void main(String[] args) {
	   Y obj = new Y();

	}

}
