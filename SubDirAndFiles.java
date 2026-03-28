import java.io.File;
import java.util.Scanner;

public class SubDirAndFiles {

   
    static void listFiles(File dir) {
        File[] files = dir.listFiles();         //gets all files from dir
        if (files == null) return;

        for (File f : files) {
            System.out.println(f.getAbsolutePath());        //print full path of each file
            if (f.isDirectory()) {      //if it is a folder call the method again
                listFiles(f); 
            }
        }
    }

    
    static String searchFile(File dir, String name) {
        File[] files = dir.listFiles();                 //Searches for a file and returns its full path if found
        if (files == null) return null;         

        for (File f : files) {
            if (f.isFile() && f.getName().equals(name)) {           //if file matches the name return its path
                return f.getAbsolutePath();
            }
            if (f.isDirectory()) {                      //if folder search inside it 
                String result = searchFile(f, name);        //if found then return the result
                if (result != null) return result;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        File dir = new File(sc.nextLine());

        if (!dir.isDirectory()) {
            System.out.println("Invalid directory");
            return;
        }

        System.out.println("\nAll files and folders:");
        listFiles(dir);

        System.out.print("\nEnter file name to search: ");
        String name = sc.nextLine();

        String path = searchFile(dir, name);

        if (path != null) {
            System.out.println("File found at: " + path);
        } else {
            System.out.println("File not found");
        }

        sc.close();
    }
}