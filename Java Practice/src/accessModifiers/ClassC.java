package accessModifiers;

public class ClassC extends ClassB {
	
	public void methodC() {
		System.out.println("from cclass c");
	}
	
	public static void main(String[] args) {
		ClassA obj= new ClassB();
		obj.method();
	}
}
