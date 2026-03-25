package graphics;

public class Figures {

    
    public interface Figure {
        double area();
    }

    
    public static class Rectangle implements Figure {
        private double length, breadth;

        public Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public double area() {
            return length * breadth;
        }
    }

    
    public static class Triangle implements Figure {
        private double base, height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        public double area() {
            return 0.5 * base * height;
        }
    }

    
    public static class Square implements Figure {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        public double area() {
            return side * side;
        }
    }

    
    public static class Circle implements Figure {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }
}