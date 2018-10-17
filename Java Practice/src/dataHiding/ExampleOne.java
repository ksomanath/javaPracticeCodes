package dataHiding;

public class ExampleOne {
	
	private double balance=50000;
	String username="raem";
	
	public double getbalance(String user_name) {
		if(username == user_name) {
			return balance;
		}
		else {
			System.out.println("wrong username");
		}
			return 0;
		
	}
	public static void main(String[] args) {
	ExampleOne obj = new ExampleOne();
	
		System.out.println(obj.getbalance("ram"));
	}

}
