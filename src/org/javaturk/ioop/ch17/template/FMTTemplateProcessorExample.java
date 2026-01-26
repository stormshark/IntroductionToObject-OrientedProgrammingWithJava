//package org.javaturk.ioop.ch17.template;
//
//import java.util.FormatProcessor;
//
//public class FMTTemplateProcessorExample {
//
//    public static void main(String[] args) {
//        Rectangle[] zone = new Rectangle[]{
//                new Rectangle("First", 17.8, 31.4),
//                new Rectangle("Second", 9.6, 12.2),
//        };
//
//        run(zone);
//    }
//
//    static void run(Rectangle[] zone) {
//        String desc = "Description";
//        String width = "Width";
//        String height = "Height";
//        String area = "Area";
//
//        String formattedTable = FormatProcessor.FMT."""
//    %-15s\{desc} %10s\{width} %11s\{height} %10s\{area}
//    %-12s\{zone[0].name()}  %12.2f\{zone[0].width()}  %10.2f\{zone[0].height()}  %10.2f\{zone[0].area()}
//    %-12s\{zone[1].name()}  %12.2f\{zone[1].width()}  %10.2f\{zone[1].height()}  %10.2f\{zone[1].area()}
//    \n\{" ".repeat(31)} Total %12.2f\{zone[0].area() + zone[1].area()}
//    """;
//
//        System.out.println(formattedTable);
//    }
//}
//
//class Rectangle {
//    String name;
//    double width;
//    double height;
//
//    Rectangle(String name, double width, double height) {
//        this.name = name;
//        this.width = width;
//        this.height = height;
//    }
//
//    String name() {
//        return name;
//    }
//
//    double width() {
//        return width;
//    }
//
//    double height() {
//        return height;
//    }
//
//    double area() {
//        return width * height;
//    }
//}
