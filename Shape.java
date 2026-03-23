import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
                                            //overloading
public class Shape {

    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    void area(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    void area(float base, float height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Shape obj = new Shape();

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");

        int ch = Integer.parseInt(br.readLine());

        switch (ch) {

            case 1:
                System.out.print("Enter radius: ");
                double r = Double.parseDouble(br.readLine());
                obj.area(r);
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = Double.parseDouble(br.readLine());
                System.out.print("Enter breadth: ");
                double b = Double.parseDouble(br.readLine());
                obj.area(l, b);
                break;

            case 3:
                System.out.print("Enter base: ");
                float base = Float.parseFloat(br.readLine());
                System.out.print("Enter height: ");
                float height = Float.parseFloat(br.readLine());
                obj.area(base, height);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
