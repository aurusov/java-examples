package constructor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyClass object1 = new MyClass(1);
		MyClass object2 = new MyClass(2);
		MyClass object3 = new MyClass(3);

		List<MyClass> array = new ArrayList<MyClass>();
		array.add(object1);
		array.add(object2);
		array.add(object3);

		System.out.println("Size of array = " + Integer.toString(array.size()));
		for (MyClass object : array) {
			System.out.println(object.getValue());
		}
	}

}
