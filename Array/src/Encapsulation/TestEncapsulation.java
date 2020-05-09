package Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating instance of account class
		Account acc = new Account();
		
		acc.setAccno(101010101);
		acc.setName("Vijay Kumar");
		acc.setEmail("vijay@email.com");
		acc.setAmount(25000);
		
		//getting values through getter methods
		System.out.println(acc.getAccno()+""+acc.getName()+""+acc.getEmail()+""+acc.getAmount());
		

	}

}
