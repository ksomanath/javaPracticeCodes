package interfaceExamples;

public interface Bikes {
 int v=100;
 abstract void Type();
	public int price(int price);
	
	public static void info() {
		 System.out.println("bikes");
	 }
	
	 default void extra() {
		 System.out.println("bikes extra");
	 }
}
