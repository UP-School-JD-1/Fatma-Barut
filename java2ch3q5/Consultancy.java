package java2ch3q5;

public class Consultancy extends Product implements Priceable
{
Double price;
Double tax;


	public Consultancy(String sku, String description, Double price, Double tax) {
		super(sku, description);
		this.price = price;
		this.tax = tax;
	}

    @Override
	public double getPrice() {
		return price;
	}

    @Override
	public void setPrice() {
		
	}

    @Override
	public double getTax() {
		return tax;
	}

    @Override
	public void setTax() {
		
	}
	

	
	@Override
	public void Purchase() {
		System.out.println(description + " is purchased at "+ this.price + "TL with "+tax + " TL tax.");	
		
	}
}
