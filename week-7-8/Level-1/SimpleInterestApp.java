import java.util.Scanner;

public class SimpleInterestApp {
    // Method to calculate simple interest based on parameters[cite: 1]
    public double calculateSimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100.0;
        return interest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleInterestApp app = new SimpleInterestApp();

        // Taking user inputs[cite: 1]
        System.out.print("Enter Principal: ");
        double principalAmount = input.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rateOfInterest = input.nextDouble();
        System.out.print("Enter Time (years): ");
        double timePeriod = input.nextDouble();

        double resultInterest = app.calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);

        // Required Output Format[cite: 1]
        System.out.println("The Simple Interest is " + resultInterest + " for Principal " + 
                           principalAmount + ", Rate of Interest " + rateOfInterest + " and Time " + timePeriod);
    }
}