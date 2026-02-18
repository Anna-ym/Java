import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pgm7 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("STRING MANIPULATION");
        System.out.println("1. Concatenate");
        System.out.println("2. Length");
        System.out.println("3. Convert Case");
        System.out.println("4. Substring");
        System.out.println("5. Compare");
        System.out.print("Enter your choice: ");

        int ch = Integer.parseInt(br.readLine());

        switch (ch) {

            case 1:
                System.out.print("Enter first string: ");
                String s1 = br.readLine();
                System.out.print("Enter second string: ");
                String s2 = br.readLine();
                System.out.println("Result: " + s1 + s2);
                break;

            case 2:
                System.out.print("Enter string: ");
                String s = br.readLine();
                System.out.println("Length: " + s.length());
                break;

            case 3:
                System.out.print("Enter string: ");
                String str = br.readLine();
                System.out.println("Uppercase: " + str.toUpperCase());
                System.out.println("Lowercase: " + str.toLowerCase());
                break;

            case 4:
                System.out.print("Enter string: ");
                String sub = br.readLine();
                if (sub.length() >= 4)
                    System.out.println("Substring(0,4): " + sub.substring(0, 4));
                else
                    System.out.println("String too short");
                break;

            case 5:
                System.out.print("Enter first string: ");
                String a = br.readLine();
                System.out.print("Enter second string: ");
                String b = br.readLine();
                System.out.println("Equals: " + a.equals(b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
