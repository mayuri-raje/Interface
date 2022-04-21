interface A{
	void show();
	
}

class Sample3 implements A
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Interface method Implemented");
	}


	
}
public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=() -> System.out.println("Lambda Expression for Functional Interface Method Implementation");
		a1.show();
	}

}
