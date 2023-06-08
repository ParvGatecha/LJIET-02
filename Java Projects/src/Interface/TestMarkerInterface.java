package Interface;
interface registerStudent{
	
}

class Student implements registerStudent{
	public static void isRegister() {
		System.out.println("yes,you are register");
	}
}

public class TestMarkerInterface {
	public static void main(String[] args) { 
		Student s1=new Student();
		s1.isRegister();

	}

}
