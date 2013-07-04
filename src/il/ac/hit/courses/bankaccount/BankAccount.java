package il.ac.hit.courses.bankaccount;

public class BankAccount {

	private int id;
	private double balance;
	private String name;
		


	public BankAccount(int id, double balance, String name) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
	}
	public BankAccount(int idVal,String name) {
		this(idVal,0,name);
	}
	
	

	public void setId(int idVal) {
		if (idVal > 0) {
			this.id = idVal;
		}
	}
	
	public void setBalance(double balanceVal) {
		this.balance = balanceVal;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	public void deposit(double sum){
		this.balance=sum+balance;
	}
	
	public boolean withdraw(double sum) {
		boolean result=false;
		if (this.balance>sum) {
			this.balance-=sum;
			result=true;
			return result;
		}
		else 
			return result;
		
		
	}


}
