import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args)throws IOException {
        System.out.println("Hello World!!!");
        int age;
        String name = "Anna";
        age = 21;
        System.out.println(name + " is of age " +age);
        DataInputStream dis = new DataInputStream(System.in);
        InputStreamReader isr = new InputStreamReader(dis);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("You entered: " + num);
    }
}
