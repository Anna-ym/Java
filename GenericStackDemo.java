import java.util.ArrayList;
import java.util.Scanner;

// Generic Stack Class
class GStack<T> {

    ArrayList<T> stack;     //T means any data type.this stack works for any type, not just one 
    int size;             

    
    public GStack(int size) {
        this.size = size;
        stack = new ArrayList<T>();
    }

    
    void push(T element) {
        if (stack.size() < size) {
            stack.add(element);
        } else {
            System.out.println("Stack Overflow");
        }
    }

    
    T pop() {
        if (stack.size() == 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    
    void display() {
        if (stack.size() == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (T element : stack) {
                System.out.println(element);
            }
        }
    }
}


class GenericStackDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter stack size:");
        int size = scanner.nextInt();

        GStack<Integer> stack = new GStack<>(size);

        boolean flag = true;

        while (flag) {
            System.out.println("\n1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Enter your option: ");

            int op = scanner.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Enter element to be pushed: ");
                    int ele = scanner.nextInt();
                    stack.push(ele);
                    break;

                case 2:
                    Integer popped = stack.pop();
                    if (popped != null) {
                        System.out.println("Removed element = " + popped);
                    }
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    flag = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }
        }

        scanner.close();
    }
}