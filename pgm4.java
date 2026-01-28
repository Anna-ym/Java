import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pgm4 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,flag=1;
        int m1[][];
        int m2[][];
        System.out.println("Enter the no.of rows: ");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter the no.of columns(column number must be same as row number): ");
        n=Integer.parseInt(br.readLine());
        m1 = new int[m][n];
        m2 = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter ["+i+"]["+j+"] element: ");
                m1[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m2[j][i]=m1[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(m2[i][j]!=m1[i][j]){
                    flag=0;
                }
            }
        }
        if(flag==1){
            System.out.println("The given matrix is symmetric!!!");
        }
        else{
             System.out.println("The given matrix is not symmetric!!!");
        }
    }
}
