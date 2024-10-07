package in.basics;
//WAP to print from 1 to 5

class PrintNumber{
	public static void print(int num) {
		if(num==6) return;
		System.out.println(num);
		print(num+1);
	}
}

public class Recursion_I {

	public static void main(String[] args) {
		PrintNumber.print(1);

	}

}
