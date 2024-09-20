package popo;

import java.util.Scanner;

public class queue {
    static int[] queue = new int[10];
    static int front = -1;
    static int rear = -1;

    public static void insert(int element) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % queue.length;
            queue[rear] = element;
        }
    }

    public static int delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int deletedElement = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % queue.length;
            }
            return deletedElement;
        }
    }

    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();

        // Create a queue of the specified size
        queue = new int[size];

        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    insert(element);
                    break;
                case 2:
                    int deletedElement = delete();
                    if (deletedElement != -1) {
                        System.out.println("Deleted element: " + deletedElement);
                    }
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
