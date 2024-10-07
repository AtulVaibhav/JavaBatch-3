package in.basics;


class Box{
	int length;
	int breadth;
	
	Box(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getDimension() {
		System.out.println(this.length*this.breadth);
	}
}
public class This_II {

	public static void main(String[] args) {
		Box b1 = new Box(10,12);
		b1.getDimension();
		Box b2 = new Box(12,12);
		b2.getDimension();

	}

}
