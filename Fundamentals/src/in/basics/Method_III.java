package in.basics;

public class Method_III {
    int data=10;
    static int data2 = 20;
	public void m1() {
		System.out.println(data);
		System.out.println(data2);
	}
	
	public static void m2(Method_III obj) {
//		Method_III obj = new Method_III();
	  System.out.println(obj.data);
      System.out.println(data2);
	}
	
	public static void main(String[] args) {
		Method_III obj = new Method_III();
		obj.m1();
		
		Method_III.m2(obj);
		Method_III.m2(obj);
		Method_III.m2(obj);
	}

}
