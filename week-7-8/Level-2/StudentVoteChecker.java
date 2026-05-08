import java.util.Scanner;

public class StudentVoteChecker {
    // Method to validate age and return eligibility[cite: 2]
    public boolean canStudentVote(int age) {
        if (age < 0) return false; // Negative age validation[cite: 2]
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            
            // Displaying immediate result for each student[cite: 2]
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Result: Student can vote.");
            } else {
                System.out.println("Result: Student cannot vote.");
            }
        }
    }
}