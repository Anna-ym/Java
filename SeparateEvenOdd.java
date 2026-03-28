import java.io.*;
import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) throws IOException {

        String inputFile = "numbers.txt";
        String evenFile = "even_numbers.txt";
        String oddFile = "odd_numbers.txt";

        Scanner sc = new Scanner(new File(inputFile));          //read numbers from numbers.txt
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenFile));       //writes data to files
        BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddFile));

        while (sc.hasNextInt()) {                   //Loop runs as long as numbers exist in file
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenWriter.write(num + " ");
            } else {
                oddWriter.write(num + " ");
            }
        }

        sc.close();
        evenWriter.close();
        oddWriter.close();

        System.out.println("Even and odd numbers separated successfully.");
    }
}