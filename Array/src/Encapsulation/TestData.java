package Encapsulation;

public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentdata s = new Studentdata();
		s.setName("Aryan Sharma");
		s.setRollno(101);
		s.setStandard("Fourth Year");
		
		System.out.println(s.getRollno()+""+s.getName()+""+s.getStandard());
	}

}
