package java2ch3q5;

public class Gift extends BaseProduct implements Locatable{

String depot;
String place;


public Gift(String sku, String description, String depot, String place) {
	super(sku, description);
	this.depot = depot;
	this.place = place;
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

public void prepare() {
	System.out.println("Gift is ready at" + depot + "depot in" + place );
}

}
