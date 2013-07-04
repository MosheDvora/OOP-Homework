package il.ac.courses.person;

public class PersonProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Moshe",120,024052341,73,true);
		Person p2 = new Person();
		Person p3 = new Person("Moshe",120,024052341,73,true);
		
		p2.setHeir(true);
		
		System.out.println("Name:"+p1.getName()+"	Hight:"+p1.getHeight()+"	ID:"+p1.getId()+"	Weight:"+p1.getWeight()+"	Hair:"+p1.getHeir());
		System.out.println("Name:"+p2.getName()+"	Hight:"+p2.getHeight()+"	ID:"+p2.getId()+"	Weight:"+p2.getWeight()+"	Hair:"+p2.getHeir());
		
		System.out.println(p1.equals(p3));
		

	}

}
