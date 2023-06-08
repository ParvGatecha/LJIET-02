package Interface;

interface vehicle{
	void stopVehicle();
	default void startVehicle() {
		System.out.println("vehicle is starting");
	}
	//void accelerate();
}
class Car implements vehicle{
	public void stopVehicle() {
		System.out.println("vehicle is stoping");
	}
	public void startVehicle() {
		System.out.println("starting my vehicle");
	}
}

public class TestDefaultMethod {

	public static void main(String[] args) { 
		Car mycar=new Car();
		mycar.startVehicle();
		mycar.stopVehicle();

	}

}
