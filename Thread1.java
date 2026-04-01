class Fibonacci implements Runnable{
    int n;
    Fibonacci(int n){
        this.n=n;
    }
    public void run(){
        int a=0,b=1,c;
        System.out.println("Fibonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.println(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
}
class EvenNumbers implements Runnable{
    int start,end;
    EvenNumbers(int start,int end){
        this.start=start;
        this.end=end;
    }
    public void run(){
        System.out.println("Even numbers: ");
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
}
public class ThreadExample{}