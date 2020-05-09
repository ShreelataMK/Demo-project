
public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		
		a1.insert(12345,"Ankit",1000);
		a1.display();
		a1.checkbalance();
		
		a1.deposite(4000);
		a1.checkbalance();
		
		a1.withdraw(1500);
		a1.checkbalance();
		
	}

}
