import graphics.Figures;

public class TestGraphics {
    public static void main(String[] args) {

        Figures.Rectangle rect = new Figures.Rectangle(10, 5);
        Figures.Triangle tri = new Figures.Triangle(6, 4);
        Figures.Square sq = new Figures.Square(7);
        Figures.Circle cir = new Figures.Circle(3);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
        System.out.println("Area of Square: " + sq.area());
        System.out.println("Area of Circle: " + cir.area());
    }
}