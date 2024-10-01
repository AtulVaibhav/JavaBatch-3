package in.basics;

public class TypeCasting {

	public static void main(String[] args) {
		short a = 156;// -128 127
		int b = a;
		System.out.println(b);
		
		//explicit type casting: data loss
		int x = 145;
		byte y = (byte)x;
		
		System.out.println(x+" "+y);
	}

}
