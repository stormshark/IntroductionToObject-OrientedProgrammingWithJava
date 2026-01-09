package org.javaturk.ioop.ch17.template;

import java.util.Scanner;

public class StringTemplateExample {
    public static void main(String[] args) {
        run1();
//        run2();
        run3();
//    run5();
    }

    /**
     * <a href="https://docs.oracle.com/en/java/javase/21/language/string-templates.html">...</a>
     */
    public static void run1() {
        String name = "Duke";
        String info = STR."My name is \{name}";
        System.out.println(info);

        int x = 10;
        int y = 20;
        String s = STR."\{x} + \{y} = \{x + y}";
        System.out.println(s);

        String you = new String("George");
        info = STR."Hey \{you}, how are you?";
        System.out.println(info);
    }

    public static void run2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name: ");
        String yourName = sc.next();
        String greeting = STR."Hey \{yourName}, how are you?";
        System.out.println(greeting);
    }

    /**
     * <a href="https://docs.oracle.com/en/java/javase/21/language/string-templates.html">...</a>
     */
    static void run3(){
        int index = 0;
        String data = STR."\{index++}, \{index++}, \{++index}, \{index++}, \{index}";
        System.out.println(data);
    }

    public static void run4() {
        String name = "Duke";
//        String template = "My name is \{name}";
//        String info = STR.template;
        String info = STR."My name is \{name}";
        System.out.println(info);
    }

    /**
     * <a href="https://docs.oracle.com/en/java/javase/21/language/string-templates.html">...</a>
     */
    static void run5() {
        String title = "My Web Page";
        String text = "Hello, world";
        String webpage = STR."""
         <html>
                <head>
                    <title>\{title}</title>
                </head>
                <body>
                    <p>\{text}</p>
                </body>
        </html>
    """;
        System.out.println();
        System.out.println(webpage);
    }
}
