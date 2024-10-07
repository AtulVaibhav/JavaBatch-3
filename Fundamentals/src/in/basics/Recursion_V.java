package in.basics;

class Logic3{
	static int sum=0;
	public static void getSum(int num) {
		if(num==0) {
			System.out.println(sum);
			return;
		}
		sum +=num%10;
		getSum(num/10);
	}
}
public class Recursion_V {

	public static void main(String[] args) {
		Logic3.getSum(1234);

	}

}
