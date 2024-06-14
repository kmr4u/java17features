package org.example;

public class PatternMatching {

    public static void main(String[] args) {
        // Pattern Matching for instanceof
        Object obj = "Hello";
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }

        // Pattern Matching for switch is not yet supported
        /*Object obj2 = "Hello";
        switch (obj2) {
            case String str -> System.out.println(str.toUpperCase());
            case Integer i -> System.out.println(i);
            default -> System.out.println("Unknown type");
        }*/
    }
}
