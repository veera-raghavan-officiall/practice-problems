/**
 * StudentGrades.java - Manages student marks using a 2D array.
 * @author Veera Raghavan
 */
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        
        // 2D Array: rows = students, columns = 3 (Phys, Chem, Maths)
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = input.nextInt();
                
                if (marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.println("Invalid marks. Re-enter.");
                    j--; 
                }
            }
            
            // Calculate percentage
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Assign Grade
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else grades[i] = 'F';
        }

        System.out.println("\n--- Performance Summary ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d | Perc: %.2f%% | Grade: %c\n", (i+1), percentages[i], grades[i]);
        }
        input.close();
    }
}