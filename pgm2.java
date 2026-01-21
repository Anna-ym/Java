
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pgm2 {
    public static void main(String args[]) throws IOException{
        int i,j,n,m;
        int m1[][];
        int m2[][];
        int tot[][];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no.of rows: ");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter the no.of columns: ");
        n=Integer.parseInt(br.readLine());
        m1 = new int[m][n];
        m2 = new int[m][n];
        tot = new int[m][n];
        System.out.println("Enter the first matrix: ");
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.println("Enter ["+i+"]["+j+"] each elements: ");
                m1[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Enter the second matrix: ");
         for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.println("Enter ["+i+"]["+j+"] each elements: ");
                m2[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("First Matrix");
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
               System.out.print(m1[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println();
        System.out.println("Second Matrix");
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
               System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
                tot[i][j]=m1[i][j]+m2[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of matrices");
        for( i=0;i<m;i++){
            for(j=0;j<n;j++){
               System.out.print(tot[i][j]+" ");
            }
            System.out.println();
        }
    }
}
