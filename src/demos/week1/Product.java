package demos.week1;

public class Product
{
	private String name; 
	private double price; 
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public void reducePrice(double amount)
	{
		price = price - amount;
	}
	public static void main(String args[])
	{
		Product cereal = new Product("Cereal", 4.99);
		Product kimchi = new Product("Kimchi", 8.75);
		
		// Cereal
		System.out.println("Name: " + cereal.getName());
		System.out.println("Price: " + cereal.getPrice());
		cereal.reducePrice(1.5);
		System.out.println("Price: " + cereal.getPrice());
		
		// Kimchi
		System.out.println("Name: " + kimchi.getName());
		System.out.println("Price: " + kimchi.getPrice());
		kimchi.reducePrice(1.5);
		System.out.println("Price: " + kimchi.getPrice());
		
	}
}