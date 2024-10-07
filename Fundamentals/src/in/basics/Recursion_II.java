package in.basics;


class SumOfNumbers{
	static int sum=0;
	public static void printSum(int num) {
		if(num<1) {
			System.out.println(sum);
			return;
		}
		sum +=num;
		printSum(num-1);
	}
}
public class Recursion_II {

	public static void main(String[] args) {
		SumOfNumbers.printSum(5);

	}

}
