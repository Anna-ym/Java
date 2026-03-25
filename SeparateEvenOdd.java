import java.io.*;
import java.util.Scanner;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        String inputFile = "numbers.txt";       
        String evenFile = "even_numbers.txt";   
        String oddFile = "odd_numbers.txt";     

        try (
            Scanner sc = new Scanner(new File(inputFile));
            BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenFile));
            BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddFile));
        ) {
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenWriter.write(num + " ");
                } else {
                    oddWriter.write(num + " ");
                }
            }
            System.out.println("Even and odd numbers have been separated successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
