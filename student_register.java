package popo;
import java.util.Scanner; 


//public class student_register {
//
//}

class Student {
    String name;
    int registerNumber;

    public Student(String name, int registerNumber) {
        this.name = name;
        this.registerNumber = registerNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + registerNumber);
    }
}

class Marks extends Student {
    int marks1, marks2, marks3;

    public Marks(String name, int registerNumber, int marks1, int marks2, int marks3) {
        super(name, registerNumber);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int calculateTotalMarks() {
        return marks1 + marks2 + marks3;
    }
}

public class student_register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter register number: ");
        int registerNumber = scanner.nextInt();

        System.out.print("Enter marks for subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int marks3 = scanner.nextInt();

        Marks student = new Marks(name, registerNumber, marks1, marks2, marks3);
        student.displayDetails();
        System.out.println("Total Marks: " + student.calculateTotalMarks());
    }
}