package arithmetic;
public interface Operation {
    double calculate(double a, double b);
}
class Addition implements Operation {
    public double calculate(double a, double b) {
        return a + b;
    }
}
class Subtraction implements Operation {
    public double calculate(double a, double b) {
        return a - b;
    }
}
class Multiplication implements Operation {
    public double calculate(double a, double b) {
        return a * b;
    }
}
class Division implements Operation {
    public double calculate(double a, double b) {
        return a / b;
    }
}