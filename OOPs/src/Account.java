
public class Account {
	
	int acc_no;
	String name;
	float amount;
	

	public void insert(int a, String n, int amt) {
		// TODO Auto-generated method stub
		acc_no = a;
		name =  n;
		amount = amt;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(acc_no+" "+name+" "+amount);
	}

	public void checkbalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance is:"+amount);
	}

	public void deposite(int amt) {
		// TODO Auto-generated method stub
		amount = amount+amt;
		
		System.out.println(amt+ "deposite");
	}

	public void withdraw(float amt) {
		// TODO Auto-generated method stub
		if(amount<amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"withdrawn");
		}
		
	}


}
