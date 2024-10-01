package in.basics;

public class Method_IV {
    int data=10;
    public int getSquare() {
    	int result = data*data;
    	return result;
    }
	public static void main(String[] args) {
		Method_IV obj = new Method_IV();
		int result = obj.getSquare();
		System.out.println(result);
	}

}
