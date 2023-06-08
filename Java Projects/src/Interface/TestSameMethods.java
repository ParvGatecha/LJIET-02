package Interface;
interface interface1{
	default void doSome() {
		System.out.println("first interface");
	}
}
interface interface2{
	default void doSome() {
		System.out.println("second interface");
	}
}
class ImplementInterface implements interface1,interface2{
	public void doSome() {
		interface1.super.doSome();
		interface2.super.doSome();
	}
}


public class TestSameMethods {

	public static void main(String[] args) {
		ImplementInterface obj =new ImplementInterface();
		obj.doSome();

	}

}
