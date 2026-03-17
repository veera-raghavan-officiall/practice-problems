import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Gather marks for PCM
        System.out.print("Enter Physics marks: ");
        double physics = input.nextDouble();
        
        System.out.print("Enter Chemistry marks: ");
        double chemistry = input.nextDouble();
        
        System.out.print("Enter Maths marks: ");
        double maths = input.nextDouble();
        
        // Calculate average
        double average = (physics + chemistry + maths) / 3;
        System.out.println("Average Marks: " + average + "%");
        
        // Determine grade based on thresholds
        if (average >= 80) {
            System.out.println("Grade: A, Remarks: Level 4, above agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Grade: B, Remarks: Level 3, at agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Grade: C, Remarks: Level 2, below, but approaching agency-normalized standards");
        } else if (average >= 50) {
            System.out.println("Grade: D, Remarks: Level 1, well below agency-normalized standards");
        } else if (average >= 40) {
            System.out.println("Grade: E, Remarks: Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Grade: R, Remarks: Remedial standards");
        }
        
        // Close the scanner
        input.close();
    }
}