package de.tum.jk.inheritance;

public class SubClass extends SuperClass {

	public SubClass(int value) {
		super(value);
	}

	public void print() {
		System.out.println("SubClass: " + value);
	}

}
