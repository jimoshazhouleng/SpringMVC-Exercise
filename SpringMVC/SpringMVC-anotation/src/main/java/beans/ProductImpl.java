package beans;
import java.io.Serializable;

public class ProductImpl implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name; 
	private float price;
	public String getName() {
		return name;  
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	} 
	
	
}
