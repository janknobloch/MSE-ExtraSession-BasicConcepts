package de.tum.jk.basicconcepts;

import de.tum.jk.inheritance.SubClass;

public class CallByValueMain {

	public static void main(String[] args) {

		System.out.println("\nSTART --- CALL BY REFERENCE VS CALL BY VALUE\n");
		SubClass subClass = new SubClass(2);

		changeValue(subClass);
		System.out.print("after changeValue(subClass): = ");
		subClass.print();

		changeValueTwo(subClass);
		System.out.print("after changeValueTwo(subClass): = ");
		subClass.print();
		System.out.println("\nEND --- CALL BY REFERENCE VS CALL BY VALUE\n");

	}

	private static void changeValue(SubClass subClass) {
		SubClass newSubclass = new SubClass(4);
		subClass = newSubclass;

	}

	private static void changeValueTwo(SubClass subClass) {
		subClass.value = 4;

	}
}
