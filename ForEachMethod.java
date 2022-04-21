import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = Arrays.asList(1, 5, 8, 2, 9);

		// List<String> l1 = Arrays.asList("hello");

		// External Loops
		/*
		 * for (int i = 0; i < l1.size(); i++) { System.out.println(l1.get(i)); }
		 * 
		 * for (int i : l1) { System.out.println(i); }
		 */

		// Java - 8 Internal Loop
		// Faster

		l1.forEach((i) -> System.out.println(i));	//Consumer (Functional) Interface (accept) method Implementation
	}

}
