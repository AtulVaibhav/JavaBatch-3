package in.basics;

class Product{
	double productPrice=567.46;
	
	public void getPrice() {
		double productPrice = 120.45;
		System.out.println(this.productPrice);
	}
	
	public static void findPrice(Product p) {
		System.out.println(p.productPrice);
	}
}


public class This_III {

	public static void main(String[] args) {
       Product p = new Product();
       p.getPrice();
       
       Product.findPrice(p);
       
       
	}

}
