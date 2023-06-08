package Interface;

@FunctionalInterface
interface mySquare {
	int calculate(int no);
	// int add(int no1,int no2);
}

class ImplementMySquare implements mySquare {
	public int calculate(int no) {
		return no * no;
	}
}

public class TestFunctionalInterface {

	public static void main(String[] args) {
		ImplementMySquare obj = new ImplementMySquare();
		int ans = obj.calculate(10);
		System.out.println(ans);

	}

}
