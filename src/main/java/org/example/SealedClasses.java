package org.example;

public class SealedClasses {

    // sealed class can be extended only by the classes permitted by it
    // sealed class can be abstract or non-abstract
    // subclasses of sealed class can be final, non-sealed, or sealed
    // sealed interfaces is also possible

    //All permitted subclasses must belong to the same module as the sealed class.
    //Every permitted subclass must explicitly extend the sealed class.
    //Every permitted subclass must define a modifier: final, sealed, or non-sealed.

    abstract sealed class Shape permits Circle, Rectangle, Triangle {
        public static final double PI = 3.14159;
        public abstract double area();
    }

    final class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return PI * radius * radius;
        }
    }

    non-sealed class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    final class Triangle extends Shape {
        private final double base;
        private final double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            return 0.5 * base * height;
        }
    }
}
