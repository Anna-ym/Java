import java.io.IOException;
interface shape{
    void area(float a,float b);
    void perimeter(float a,float b);
}
class Circle implements shape{
    public void area(float a,float b){
        System.out.println("The area of circle is: "+3.14*a*a);
    }
    public void perimeter(float a,float b){
        System.out.println("The perimeter of a circle is: "+2*3.14*a);
    }
}
class Rectangle implements shape{
    public void area(float a,float b){
        System.out.println("The area of rectangle is: "+a*b);
    }
    public void perimeter(float a,float b){
        System.out.println("The perimeter of rectangle is: "+2*(a+b));
    }
}




public class interf {
    public static void main(String args[])throws IOException{
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.area(2,0);
        c.perimeter(2,0);
        r.area(2,2);
        r.perimeter(2,3 );
    }
    
}
