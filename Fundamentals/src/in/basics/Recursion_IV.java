package in.basics;


class Logic2{
	public static int fact(int i) {
		if(i<1) return 1;
		return i*fact(i-1);
	}
}
public class Recursion_IV {

	public static void main(String[] args) {
		System.out.println(Logic2.fact(4));

	}

}
