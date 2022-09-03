package java2ch3q5;

public class BaseProduct {
	String sku;
	String description;


	public BaseProduct(String sku, String description) {
		super();
		this.sku = sku;
		this.description = description;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	}
