import java.util.Scanner;

public class RickshawFare {
    public static void main(String[] args) {
       
        final double BASE_FARE = 50.0;  // Base fare in Rs.
        final double PER_KM_CHARGE = 10.0;  // Per kilometer charge in Rs.
        final double PER_MINUTE_CHARGE = 2.0;  // Per minute charge in Rs.
        final double LOCAL_DISCOUNT = 0.1;  // 10% discount for locals on long distances
        final double NIGHT_SURCHARGE = 0.2;  // 20% surcharge for night travel
        final double LONG_DISTANCE_THRESHOLD = 10.0;  
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter distance traveled (in km): ");
        double distance = scanner.nextDouble();
        
        System.out.print("Enter travel time (in minutes): ");
        int time = scanner.nextInt();
        
        System.out.print("Is the customer a local? (true/false): ");
        boolean isLocal = scanner.nextBoolean();
        
        System.out.print("Is the travel during night time? (true/false): ");
        boolean isNightTime = scanner.nextBoolean();
        
        // Calculate base fare
        double fare = BASE_FARE + (distance * PER_KM_CHARGE) + (time * PER_MINUTE_CHARGE);
        
        // Apply local discount for long distances using ternary operator
        double discount = (isLocal && distance > LONG_DISTANCE_THRESHOLD) ? fare * LOCAL_DISCOUNT : 0;
        fare -= discount;
        
        // Apply night surcharge using ternary operator
        double surcharge = isNightTime ? fare * NIGHT_SURCHARGE : 0;
        fare += surcharge;
        
        // Round to nearest integer
        int finalFare = (int) Math.round(fare);
        
        // Display the final fare in Nepali format
        System.out.println("Final fare: Rs. " + finalFare);
        
        // Close the scanner
        scanner.close();
    }
}