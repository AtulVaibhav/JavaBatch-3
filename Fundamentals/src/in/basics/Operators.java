package in.basics;

public class Operators {
   public static void arithmeticOperators() {
	   int a = 10;
	   int b = 5;
	   
	   System.out.println(a+b);
	   System.out.println(a-b);
	   System.out.println(a*b);
	   System.out.println(a/b);
	   System.out.println(a%b);
	   System.out.println("_____________________");
   }
   public static void relationalOperators() {
	   int x = 20;
	   int y = 30;
	   System.out.println(x>y);
	   System.out.println(x>=y);
	   System.out.println(x<y);
	   System.out.println(x<=y);
	   System.out.println(x==y);
	   System.out.println(x!=y);
	   System.out.println("___________________________");
   }
   
   public static void logicalOperators() {
	   int x=10;
	   int y = 20;
	   System.out.println((x<y) && (x!=y));
	   System.out.println(!((x<y) || (x!=y) && !(x>y)));  
	   System.out.println("________________________");
   }
   
   public static void ternaryOperator() {
	   boolean isLoggedIn = true;
	    String result = isLoggedIn? "Hello User" : "please log in";
       System.out.println(result);
   }
   
   public static void unaryOperators() {
	   int a = 10;
	   int b = a++;
	   System.out.println(a+" "+b);
	   
	   int x=12;
	   int y = ++x;
	   System.out.println(x+" "+y);
   }
   
   public static void assignmentOperators() {
	   int a = 10;
	   a += 10; // a = a+10
	   System.out.println(a);
	   a -=18;// a = a/18
	   System.out.println(a);
   }
   
   public static void bitwiseOperators() {
	   int a = 10;  // 
	   int b=5;
	   System.out.println(a&b);
	   System.out.println(a|b);
	   System.out.println(a^b);
   }
   
   public static void shiftOperators() {
	   int num=10;
	   System.out.println(10<<4);
	   System.out.println(10>>2);
   }
   
   public static void instanceOfOperator() {
	   String str = "Hello";
	   int a = 10;
	   System.out.println(str instanceof String);
   }
   
   
	public static void main(String[] args) {
        Operators.arithmeticOperators();
        Operators.relationalOperators();
        Operators.logicalOperators();
        Operators.ternaryOperator();
        Operators.unaryOperators();
        Operators.assignmentOperators();
        Operators.bitwiseOperators();
        Operators.shiftOperators();
        Operators.instanceOfOperator();
	}

}
