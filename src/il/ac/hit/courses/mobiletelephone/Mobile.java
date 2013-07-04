package il.ac.hit.courses.mobiletelephone;
	import java.awt.Color;
public class Mobile {
	private String ownerName,number,model;
	private Color color;
	public Mobile(String ownerName, String number, String model, Color color) {
		this.ownerName = ownerName;
		this.number = number;
		this.model = model;
		this.color = color;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getNumber() {
		return number;
	}
	public String getModel() {
		return model;
	}
	public Color getColor() {
		return color;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void phoneInfo() 
	{
		System.out.println("Phone Info:\nOwner Name:"+this.getOwnerName()
							+"\nNumber:"+this.getNumber()
							+"\nColor:"+this.getColor()
							+"\nModel:"+this.getModel());
	}
	
	
	

}
