package java2ch3q5;


public class ClothProduct extends Product implements Locatable, Priceable {

	private String place;
	private String depot;
	private Double price;
	private Double tax;
	private String sex;
	private String size;
	
	public ClothProduct(String sku, String description,String sex, String size, double price, double tax, String depot, String place) {
		super(sku, description);
		this.place = place;
		this.depot = depot;
		this.price = price;
		this.tax = tax;
		this.sex= sex;;
		this.size= size;
	}
	
    @Override
	public String getPlace() {
		return place;
	}
    
    @Override
	public void setPlace() {
	
	}
    
    @Override
	public String getDepot() {
		return depot;
	}
    
    @Override
	public void setDepot() {
		
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public void Purchase() {
		System.out.println(description + " ( "+ sex +", "+ getSize() + ") is purchased at "+ this.price + "TL with "+tax+ " TL tax from "+ depot+ " in "+place);	
		
	}

}
