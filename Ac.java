package ac;

public class Ac {
	private String brand;
	private String model;
	private int price;
	private Motor motor;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return this.model;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setMotor(Motor motor) {
		this.motor=motor;
	}
	public Motor getMotor() {
		return this.motor;
	}

}
