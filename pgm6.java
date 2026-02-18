
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class pgm6 {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[];
        int n;
        int i,j;
        int search;
        int flag=0;
        System.out.println("Enter the number of arrays: ");
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        System.out.println("Enter the arrays: ");
        for(i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
          for(i = 0; i < n - 1; i++){
            for(j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(i = 0; i < n; i++){
            System.out.print(arr[i] + " \n");
        }
        System.out.println("Enter the element to search: ");
        search=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++){
            if(arr[i]==search){
                System.out.println("Element found at "+i);
                flag=1;
            }

        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }

}
