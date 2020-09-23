package constructor1;

public class Product {
	
	private int pid;
	private String pname;
	private double price;
	private double rating;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int pid, String pname, double price){
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public Product(int pid, String pname, double price, double rating){
		this(pid, pname, price);
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Product [ProductID = " + pid + ", Name =" + pname + ", Price = " + price + ", Rating = " + rating + " stars]";
	}

}