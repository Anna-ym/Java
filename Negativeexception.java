import java.util.Scanner;

class NegativeNumberException extends RuntimeException {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

public class Negativeexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter how many numbers: ");
            int n = sc.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                int num = sc.nextInt();

               
                if (num < 0) throw new NegativeNumberException("Negative number is not allowed");

                sum += num;
            }

            System.out.println("Average = " + (sum / (double)n));

        } catch (NegativeNumberException e) {
            
            System.out.println("Error: "+e.getMessage());
        }

        sc.close();
    }
}