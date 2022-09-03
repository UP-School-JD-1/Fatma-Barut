package java2ch3q5;

import java.util.Date;

public class FoodProduct extends Product implements Locatable,Priceable
{
	String place;
	String depot;
	Double price;
	Double tax;
	Date productionDate;
	int life;

	public FoodProduct(String sku, String description, Date productionDate, int life, String place, String depot, Double price, Double tax) {
		super(sku, description);
		this.place = place;
		this.depot = depot;
		this.price = price;
		this.tax = tax;
		this.productionDate = productionDate;
		this.life = life;
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
		
		return place;
	}

	@Override
	public void setPlace() {
	
		
	}

}
