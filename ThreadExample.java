class Fibonacci implements Runnable {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    public void run() {
        int a = 0, b = 1, c;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}

class EvenNumbers implements Runnable {
    int start, end;

    EvenNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Fibonacci(10));
        Thread t2 = new Thread(new EvenNumbers(1, 20));

        t1.start();
        t2.start();
    }
}