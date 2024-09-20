package popo;


//program 1, stack operations

public class pipi {
    static int[] stack = new int[10];
    static int top = -1;

    static void push(int element) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = element;
        }
    }

    static int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int poppedElement = stack[top];
            top--;
            return poppedElement;
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top == stack.length - 1;
    }

    static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        System.out.println("Is the stack empty? " + isEmpty());
        System.out.println("Is the stack full? " + isFull());

        int poppedElement = pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Top element: " + peek());

        display();
    }
}