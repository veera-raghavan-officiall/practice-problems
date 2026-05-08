import java.util.Scanner;

public class HandshakeCalculator {
    // Method to calculate handshakes using combination formula (n * (n - 1)) / 2[cite: 1]
    public int calculateMaxHandshakes(int n) {
        int totalHandshakes = (n * (n - 1)) / 2;
        return totalHandshakes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HandshakeCalculator calculator = new HandshakeCalculator();

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int result = calculator.calculateMaxHandshakes(numberOfStudents);

        System.out.println("The number of possible handshakes among " + numberOfStudents + " students is: " + result);
    }
}