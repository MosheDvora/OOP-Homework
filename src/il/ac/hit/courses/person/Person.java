package il.ac.hit.courses.person;

public class Person {
	private String name;
	private double height;
	private int id,weight;
	private boolean heir;
	
	
	
		
	public Person(String nameVal, double heightVal, int idVal, int weight, boolean hair) {
		this.name = nameVal;
		this.height = heightVal;
		this.id = idVal;
		this.weight=weight;
		this.heir=heir;
	}
	public Person()
	{
		this("no name",170,25555555,73,false);
	}
	
	public Person(String nameVal, int idVal){
		this(nameVal,170,idVal,0,false);
	}
	
	
	public int getWeight() {
		return weight;
	}
	public boolean isHeir() {
		return heir;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setHeir(boolean heir) {
		this.heir = heir;
	}
	public boolean getHeir() {
		return heir;
	}
	public String getName() {
		return name;
	}
	public void setName(String str) {
		this.name = str;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double number) {
		this.height = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int num) {
		if (num>0) {
		this.id = num;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Double.doubleToLongBits(height) != Double
				.doubleToLongBits(other.height))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
