import java.util.Scanner;

/**
 * Write a description of class masks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class masks
{ public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        // Ternary operator to determine pass or fail
        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        
    }
}
    
