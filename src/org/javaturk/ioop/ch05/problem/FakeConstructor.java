package org.javaturk.ioop.ch05.problem;

public class FakeConstructor {

	public FakeConstructor() {
		System.out.println("Original Constructor");
	}
	
	void FakeConstructor2() {
		System.out.println("in FakeConstructor method");
	}
	
	public static void main(String[] args) {
		FakeConstructor ref = new FakeConstructor();
		//ref.FakeConstructor();
	}
}
