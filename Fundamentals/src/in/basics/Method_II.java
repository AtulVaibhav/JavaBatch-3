package in.basics;

public class Method_II {
    public void m1() {
    	System.out.println("m1() method called");
    }
    
    public void m1(int a) {
    	System.out.println("m1() with arg called");
    }
	public static void main(String[] args) {
		new Method_II().m1(10);// Method Binding
    // the process of linking method call with method definition
	}

}
