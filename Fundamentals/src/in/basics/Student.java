package in.basics;

public class Student {
	
	public Student() {
		System.out.println("Hello from default consructor");
	}
    public Student(int a) {
    	System.out.println("Hello from one-arg consructor");
    }
	public static void main(String[] args) {
		Student s1 = new Student(10);
	}

}
