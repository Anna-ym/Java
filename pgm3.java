
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pgm3 {
    public static void main(String args[])throws IOException{
        int a1,a2,b1,b2,a3,b3;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first real number: ");
        a1=Integer.parseInt(br.readLine());
        System.out.println("Enter the first imaginary number: ");
        b1=Integer.parseInt(br.readLine());
        System.out.println("Enter the second real numbers: ");
        a2=Integer.parseInt(br.readLine());
        System.out.println("Enter the second imaginary number: ");
        b2=Integer.parseInt(br.readLine());
        a3=a1+a2;
        b3=b1+b2;
        System.out.println("The first Complex number is: "+a1+" + "+b1+" i");
        System.out.println("The second Complex number is: "+a2+" + "+b2+" i");
        System.out.println("The resultant Complex number is: "+a3+" + "+b3+" i");


    }
}
