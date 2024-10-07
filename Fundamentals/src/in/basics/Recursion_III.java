package in.basics;


class Logic{
	static int power = 1;
	public static void getPower(int base,int exp) {
		if(exp<1) {
			System.out.println(power);
			return;
		}
		power *= base ;//power = power*base;
		getPower(base,exp-1);
	}
}


public class Recursion_III {

	public static void main(String[] args) {
		Logic.getPower(2, 0);

	}

}
