package in.basics;

public class Method_I {
	//function definition
	public void m1() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		System.out.println("Current executing thread :"+Thread.currentThread().getName());
       Method_I obj = new Method_I();
       //calling function: objName.fnName();
       obj.m1();
       System.out.println("Java Program");
	}

}
