package model;

public class Coffee {
	
	private Float price;
	private String name;
	
	public Coffee() {
		this.price = 0f;
		this.name = "Coffee";
	}
	
	public void prepare() {
		
	}
	
	public Float getPrice() {
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + " / price: " + this.price;
	}
}
