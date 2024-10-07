package in.basics;


class A{
	static int count;
	static {
		count=0;
	}
	{
		count++;
	}
}
public class Query2 {

	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println(A.count);
		

	}

}
