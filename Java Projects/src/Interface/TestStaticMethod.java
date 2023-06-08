package Interface;
interface myVehicle{
	static void startMyVehicle() {
		System.out.println("starting my vehicle");
	}
}
class MyCar implements myVehicle{
	/*@Override
	public void startMyVehicle() {
		System.out.println("starting my vehicle");
	}*/
	
}
public class TestStaticMethod {
	public static void main (String args[]) {
		myVehicle.startMyVehicle();
		
	}

}
