import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteRead {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Writing to file
        FileWriter writer = new FileWriter("sample.txt");
        System.out.print("Enter text to write into file: ");
        String input = sc.nextLine();
        writer.write(input);
        writer.close();

        // Reading from file
        FileReader reader = new FileReader("sample.txt");
        BufferedReader br = new BufferedReader(reader);

        System.out.println("\nFile contents:");
        String line;
        while ((line = br.readLine()) != null) {            //read a line,store it in line and continue loop only if it is not null
            System.out.println(line);
        }

        br.close();
        sc.close();
    }
}