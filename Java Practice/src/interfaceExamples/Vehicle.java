package interfaceExamples;

 public interface Vehicle {
 int v=89;
	 abstract void Type();
	 public void vehiclecompany();
	 public int price(int price);
	 
	 
	 public static void info() {
		 System.out.println("vehicle");
	 }
	 
	
	 default void extra() {
		 System.out.println("vehicle extra");
	 }
}
 