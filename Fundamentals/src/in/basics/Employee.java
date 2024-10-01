package in.basics;

public class Employee {
   int empId;
   String empName;
   
   Employee(int id,String name){
	   empId = id;
	   empName = name;
   }
   
   public void getInfo() {
	   System.out.println("EmpId :"+empId+" EmpName :"+empName);
   }
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Harsh");
		e1.getInfo();
		
		Employee e2 = new Employee(102,"Amit");
		e2.getInfo();

	}

}
