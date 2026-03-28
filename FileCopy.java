import java.io.*;

class FileCopy {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Source File path:");
        String sourcePath = reader.readLine();

        System.out.println("Enter Destination File path:");
        String destinationPath = reader.readLine();

        // Reading all bytes from source file
        FileInputStream inputStream = new FileInputStream(new File(sourcePath));
        byte[] buffer = inputStream.readAllBytes();     //Read the whole file and store it in a byte array called buffer

        // Writing to destination file
        FileOutputStream outputStream = new FileOutputStream(new File(destinationPath));
        outputStream.write(buffer);

        // Closing streams
        inputStream.close();
        outputStream.close();

        System.out.println("File Copied Successfully.");
    }
}