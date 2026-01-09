package org.javaturk.ioop.ch17.textBlock;

public class TextBlockExample {
    public static void main(String[] args) {
//        example1();
//        example2();
        example3();
//        example4();

//        writeHTML1();
//        writeHTML2();
//        writeHTML3();
    }

    public static void example1() {
        String s1 = """
                I said "John, how are you?"
                He replied " Fine, how about you?"
                and he passed by. It was '5' o'clock!
                """;

        System.out.println(s1 + "The end.\n");

        String s2 = """
                I said "John, how are you?"
                He replied " Fine, how about you?"
                and he passed by. It was '5' o'clock!
        """;

        System.out.println(s2 + "The end.\n");

        String s3 = """
                              
                              
                              
                              
                I said "John, how are you?"     
            He replied " Fine, how about you?"         
                and he passed by. It was '5' o'clock!           """;

        System.out.println(s3 + " The end.");
    }

    public static void example2() {
        // It prints "I love Java" and then does not print new line because of \!
        String s = """
                \
                I\
                \slove\
                \sJava !\
                """;
        System.out.println(s);
    }

    public static void example3() {
        String s = """
                I
                love
                \""" This new feature of \"""
                Java!
                """;
        System.out.println(s);
    }

    public static void example4() {
        String s = """
                                
                \tI
                love
                Java\t!
                """;
        System.out.println(s);
    }

    public static void example5() {
        String s = """
                """;
        System.out.println(s);
    }

    public static void writeHTML1() {
        System.out.println("writeHTML1()\n");
        String html = """
                <html>
                   <body>       
                       <p>Hello World.</p>
                   </body>
                </html>
                """;
        System.out.println(html);
    }

    public static void writeHTML2() {
        System.out.println("writeHTML2()\n");
        String html = """
                     <html>
                <body>
                  <p>Hello World.</p>
                        </html>
                  """;
        System.out.println(html);
    }

    public static void writeHTML3() {
        System.out.println("writeHTML3()\n");
        String html = """
                      <html>
                                 <body>
                      <p>Hello           World.</p>
                  </body>
                         </html>
          """;
        System.out.println(html);

        String html2 = """
                """;
    }
}
