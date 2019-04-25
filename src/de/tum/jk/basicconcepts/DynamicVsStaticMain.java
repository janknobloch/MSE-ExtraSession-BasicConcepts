package de.tum.jk.basicconcepts;

import de.tum.jk.inheritance.SubClass;
import de.tum.jk.inheritance.SuperClass;

public class DynamicVsStaticMain {

	public static void main(String[] args) {


		System.out.println("\nSTART --- DYNAMIC vs. STATIC Types\n");
		SuperClass superClass = new SuperClass(1);
		SubClass subClass = new SubClass(2);

		System.out.print("after superClass.print(): = ");
		superClass.print();
		System.out.print("after subClass.print(): = ");
		subClass.print();

		SuperClass superClass2 = (SuperClass) subClass;
		System.out.print("after superClass2.print(); = ");
		superClass2.print();
		System.out.println("\nEND --- DYNAMIC vs. STATIC Types\n");

	}

}
