interface I {

	void show();

	default void display() {
		System.out.println("Method defined in interface");

	}
}

class Sample implements I {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Overridden interface method");
	}

}

public class DefaultKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1 = new Sample();
		s1.show();
		s1.display();
	}

}
