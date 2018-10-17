package interfaceExamples;

public class Example implements Vehicle, Bikes {

	public static void main(String[] args) {
		Example obj = new Example();
		int value = obj.price(998);
		System.out.println("price is " + value);
		obj.extra();
	}

	@Override
	public void vehiclecompany() {
	}

	@Override
	public int price(int price) {
		return price;
	}

	@Override
	public void Type() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extra() {
		// TODO Auto-generated method stub
		Bikes.super.extra();
	}

}
