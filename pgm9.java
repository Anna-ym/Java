import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pgm9 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] names = new String[3];   

        System.out.println("Enter 3 strings:");

        for (int i = 0; i < 3; i++) {
            names[i] = br.readLine();     
        }

        Arrays.sort(names);

        System.out.println("Sorted strings:");

        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }
}