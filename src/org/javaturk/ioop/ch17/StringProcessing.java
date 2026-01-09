package org.javaturk.ioop.ch17;

public class StringProcessing {

    public static void main(String[] args) {

        charToString();
        concat();

        String s1 = "I love Java!";
        System.out.println(reverse(s1));

        joinStrings();
    }

    public static void charToString(){
        char[] data = {'a', 'b', 'c', 'd', 'e', 'f'};
        String string = new String(data);
        System.out.println("String: " + string);
    }

    public static void concat() {
        String s1 = "Akin";
        String s2 = " ";
        String s3 = "Kaldiroglu";

        String s4 = s1.concat(s2).concat(s3);
        System.out.println(s4);

        s4 = s1 + s2 + s3;
        System.out.println(s4);
    }

    public static String reverse(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return reversed;
    }

    public static void joinStrings(){
        String names1 = String.join(" and ", "Ali", "Veli", "49", "50");
        System.out.println("\n" + names1);

        String[] names2 = {"Ayse", "Fatma", "Nuriye"};
        String nameList = String.join(", ",names2);
        System.out.println(nameList);
    }
}
