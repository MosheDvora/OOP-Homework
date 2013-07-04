package il.ac.hit.courses.bankaccount;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1,account2;
		account1 = new BankAccount(122334, 20000,"Moshe");
		account2 = new BankAccount(233445,"David");
		account1.deposit(10);
		account1.deposit(30);
		System.out.println("Account ID:"+account1.getId()+"\n"+"Account Name:"+account1.getName()+"\n"+"Account Balance:"+account1.getBalance());
		
		account1.withdraw(20000);
		System.out.println("Account ID:"+account1.getId()+"\n"+"Account Name:"+account1.getName()+"\n"+"Account Balance:"+account1.getBalance());
		System.out.println();
		account2.deposit(10);
		account2.deposit(30);
		System.out.println("Account ID:"+account2.getId()+"\n"+"Account Name:"+account2.getName()+"\n"+"Account Balance:"+account2.getBalance());
		
		
	
	}

}
