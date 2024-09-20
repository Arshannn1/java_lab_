package popo;

import java.util.Scanner;

class Stringoperations {
    // Method to copy one string into another (strcpy)
    void operation(String source) {
        String destination = source;
        System.out.println("Copied string: " + destination);
    }

    // Method to find the length of the string (strlen)
    void operation(String source, boolean isLengthOperation) {
        if (isLengthOperation) {
            int length = source.length();
            System.out.println("Length of the string: " + length);
        }
    }

    // Method to concatenate two strings (strcat)
    void operation(String str1, String str2) {
        String concatenated = str1 + str2;
        System.out.println("Concatenated string: " + concatenated);
    }

    void operation(String str1, int a)
    {
    	if (a >= 0 && a < str1.length())
    	{
    		
    		char c = str1.charAt(a);
    		System.out.println("character at " + a + " is " +  c );
    	}
    	else
    	{System.out.println("index out of bounds");
    	}
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Copy the string
        Stringoperations operations = new Stringoperations();
        
        operations.operation(inputString);

        // Find the length of the string
        operations.operation(inputString, true);

        // Concatenate two strings
        System.out.print("Enter another string: ");
        String secondString = scanner.nextLine();
        operations.operation(inputString, secondString);
        
        System.out.println("enter index:");
        int p = scanner.nextInt();
        operations.operation(inputString,p);

        scanner.close();
    }
}
