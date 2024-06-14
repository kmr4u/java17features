package org.example;


// record class is final by default - so it can't be extended
// record class is immutable
// record's fields are final by default
// accessors, constructor, equals, hashCode, and toString methods are created automatically
// record class can have static methods
// record class can implement interfaces, but cannot extend any other classes
// record class cannot have instance fields
// record class can have static fields

public record PersonRecord(String name, int age) {

    // private final String address = "Address"; - not allowed
    private static final int id = 0;

    //record class can have custom methods
    public String testMethod() {
        return "Test method";
    }

    private String calculateAge() {
        return "Age is " + age;
    }

    //record class can have static methods
    public static String testStaticMethod() {
        return "Test static method";
    }

    public void modifyName() {
        // name = "New Name"; - not allowed
    }

    //overriding default accessor
    @Override
    public int age() {
        return age+1;
    }
}
