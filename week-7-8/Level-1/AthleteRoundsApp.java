import java.util.Scanner;

public class AthleteRoundsApp {
    // Method to compute rounds needed to complete 5km run[cite: 1]
    public double computeRoundsForFiveKm(double side1, double side2, double side3) {
        double perimeterInMeters = side1 + side2 + side3;
        double totalDistanceMeters = 5000.0; // 5 km converted to meters
        double roundsRequired = totalDistanceMeters / perimeterInMeters;
        return roundsRequired;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AthleteRoundsApp app = new AthleteRoundsApp();

        System.out.println("Enter the three sides of the triangular park (in meters):");
        double sideA = sc.nextDouble();
        double sideB = sc.nextDouble();
        double sideC = sc.nextDouble();

        double rounds = app.computeRoundsForFiveKm(sideA, sideB, sideC);

        System.out.println("The athlete must complete " + Math.ceil(rounds) + " full rounds to finish 5 km.");
    }
}