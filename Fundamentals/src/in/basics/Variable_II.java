package in.basics;


//class Test{
//	static int data=2000;
//}
public class Variable_II {
     static int data = 1000;
	public static void main(String[] args) {
       // ClassName . variableName
//		System.out.println(Variable_II.data);
//		
		Variable_II obj = new Variable_II();
		Variable_II obj2 = new Variable_II();

		
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		
		obj.data = 500;
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		
		
		
		
		
		
		
	}

}
