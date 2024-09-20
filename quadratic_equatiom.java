package popo;
import java.util.Scanner; 

public class quadratic_equatiom {
     public static void main(String[] args)
     {    
    	
    Scanner scanner = new Scanner(System.in); 
     
     
     System.out.print("Enter the coefficient of x^2: ");
     double a = scanner.nextDouble();

     System.out.print("Enter the coefficient of x: ");
     double b = scanner.nextDouble();

     System.out.print("Enter the constant term: ");
     double c = scanner.nextDouble();

     double discriminant = b * b - 4 * a * c;

     if (discriminant > 0) {
         double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
         double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
         System.out.println("Two real roots: " + root1 + " and " + root2);
     } else if (discriminant == 0) {
         double root = -b / (2 * a);
         System.out.println("One real root: " + root);
     } else {
         System.out.println("No real roots");  
     }
     }
}

