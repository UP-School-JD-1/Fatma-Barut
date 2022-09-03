package java2ch3q5;

public class OldComputer extends BaseProduct implements Locatable, Priceable
{

String place;
String depot;
Double price;
Double tax;
	
	
	public OldComputer(String sku, String description, double price, double tax, String depot, String place ) {
		super(sku, description);
		this.place = place;
		this.depot = depot;
		this.price = price;
		this.tax = tax;
	}
	
	@Override
	public double getPrice() {
		System.out.println("Old Computer's price=" + price);
		return price;
	}

	@Override
	public void setPrice() {		
	}

	@Override
	public double getTax() {
		System.out.println("Old Computer's tax=" + tax);
		return tax;
	}

	@Override
	public void setTax() {
	}
	@Override
	public String getDepot() {
		
		return depot;
	}

	@Override
	public void setDepot() {
	
		
	}

	@Override
	public String getPlace() {
	
		return place
		;
	}

	@Override
	public void setPlace() {
		
	}
	
	@Override
	public void Purchase() {
		
	System.out.println(description + "is purchased at "+ price + "TL with "+tax+ " TL tax from "+ depot+ " in "+place);	
	}

}
