package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyClass1 myClass1 = new MyClass1();
		MyClass2 myClass2 = new MyClass2();

		List<MyInterface> array = new ArrayList<MyInterface>();
		array.add(myClass1);
		array.add(myClass2);

		System.out.println("Size of array = " + Integer.toString(array.size()));
		for (MyInterface myInterface : array) {
			System.out.println(myInterface.getValue());
		}
	}
}
