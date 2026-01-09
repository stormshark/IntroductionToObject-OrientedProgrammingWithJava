
package org.javaturk.ioop.ch17;

/**
 * @author akin
 *
 */
public class StringBufferAndStringBuilderExample {

	public static void main(String[] args) {
//		StringBuffer sb1 = new StringBuffer();
//		StringBuilder sb2 = new StringBuilder();
//		processString(sb1);
//		System.out.println();
//		processString(sb2);

		testEquality();
	}
	
	private static void processString(StringBuffer sb) {
		System.out.println("processString(StringBuffer sb)");
		sb.append("I love Java very much!");
		System.out.println("Reverse: " + sb.reverse());
		System.out.println("Replace: " + sb.replace(11, 15, "++C"));
		System.out.println("Reverse: " + sb.reverse());

		System.out.println();

		sb.append(" How ");
		sb.append("about ");
		sb.append("you?");
		System.out.println(sb);
		sb.setCharAt(20, ',');
		System.out.println(sb);
		sb.delete(21, sb.length());
		System.out.println(sb);
		sb.replace(sb.length() - 1, sb.length() + 2, " :)");

		String finalString = sb.toString();
		System.out.println("Final string: " + finalString);
	}

	private static void processString(StringBuilder sb) {
		System.out.println("processString(StringBuilder sb)");
		sb.append("I love Java very much!");
		System.out.println("Reverse: " + sb.reverse());
		System.out.println("Replace: " + sb.replace(11, 15, "++C"));
		System.out.println("Reverse: " + sb.reverse());

		System.out.println();

		sb.append(" How ");
		sb.append("about ");
		sb.append("you?");
		System.out.println(sb);
		sb.setCharAt(20, ',');
		System.out.println(sb);
		sb.delete(21, sb.length());
		System.out.println(sb);
		sb.replace(sb.length() - 1, sb.length() + 2, " :)");

		String finalString = sb.toString();
		System.out.println("Final string: " + finalString);
	}

	public static void testEquality(){
		String s1 = "Akin Kaldiroglu :)";
		System.out.printf("%s\n", s1);

		String s2 = new String("Akin");
		s2 += "Kaldiroglu";
		s2 += " :)";
		System.out.printf("\n%s\n%s\n", s1, s2);
		System.out.println(s1 == s2);

		StringBuilder sb1 = new StringBuilder("Akin");
		sb1.append("Kaldiroglu");
		sb1.append(" :)");
		String s3 = sb1.toString();
		System.out.printf("\n%s\n%s\n%s\n", s1, s2, s3);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);

		StringBuffer sb2 = new StringBuffer("Akin");
		sb2.append("Kaldiroglu");
		sb2.append(" :)");
		String s4 = sb2.toString();
		System.out.printf("\n%s\n%s\n%s\n%s\n", s1, s2, s3, s4);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
	}
}
