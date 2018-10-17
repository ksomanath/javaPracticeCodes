package constructors;

public class ConstructorOverloading {

	int id;
	String name;
	long mobileNo;
	
	public ConstructorOverloading(int id,String name) {
		this.id=id;
		this.name=name;		
	}
	
	public ConstructorOverloading(int id,String name,long mobileNo) {
		this.id=id;
		this.name=name;
		this.mobileNo=mobileNo;
	}

	public void DisplayStudentInfo() {
		System.out.println("Student details are : " + "ID- " +id+ ", Name- " +name+ " , Mobilenumber- " +mobileNo);
	}
    
	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading(04, "Somanath");
		ConstructorOverloading objO = new ConstructorOverloading(04, "Somanath",789080889);
		obj.DisplayStudentInfo();
		objO.DisplayStudentInfo();
	}

}
