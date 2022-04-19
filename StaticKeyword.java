interface J {

	void show();

	static void display() {
		System.out.println("Static Method defined in interface");

	}
}

class Class implements J {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Overridden interface method");

	}

}

public class StaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c1 = new Class();
		c1.show();
		J.display(); // calling static method without object of class

	}
}
