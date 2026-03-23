package graphics;
interface Figures {
    double area();
}


class Rectangle implements Figures {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}


class Triangle implements Figures {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}


class Square implements Figures {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}


class Circle implements Figures {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
