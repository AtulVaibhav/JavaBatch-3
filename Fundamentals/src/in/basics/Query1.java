package in.basics;



public class Query1 {
	static int count=0;
	Query1(){
		count++;
	}
	
	public static int getCount() {
		return count;
	}
   public static void main(String[] obj) {
	Query1 b1 = new Query1();
	Query1 b2 = new Query1();
	Query1 b3 = new Query1();
	Query1 b4 = new Query1();
	System.out.println(getCount());
}
}
