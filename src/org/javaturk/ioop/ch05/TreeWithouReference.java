package org.javaturk.ioop.ch05;

public class TreeWithouReference {
	private String type;
	private float height;

	public TreeWithouReference(String newType, float newHeight) {
		System.out.println("in TreesWithoutReferences");
		type = newType;
		height = newHeight;
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public static void main(String[] args) {
		new TreeWithouReference("Pine", 5.0f);
		// Can't reach the object created above, Pine at 5 height!

		TreeWithouReference t = new TreeWithouReference("Pine", 5.0f);
		System.out.println("Height: " + t.height + " m.");

		for (int i = 0; i < 5; i++) {
			t = new TreeWithouReference("Pine", i);
			System.out.println("Height: " + t.height + " m.");
		}

		System.out.println("Height: " + t.height + " m.");

		new TreeWithouReference("Pine", 5).printInfo();

		TreeWithouReference tt1;

		TreeWithouReference tt2 = null;
		tt2.printInfo();
	}
}
