import java.util.Scanner;

/**
 * StudentScorecardApp - Generates student performance reports
 * * @author Developer
 * @version 1.0
 */
public class StudentScorecardApp {

    // Method to calculate total, average, and percentage
    public static double[][] calculatePerformance(int[][] marks) {
        int numStudents = marks.length;
        double[][] performance = new double[numStudents][3]; // [Total, Average, Percentage]

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            double avg = (double) total / marks[i].length;
            double percentage = ((double) total / (marks[i].length * 100)) * 100;

            // Rounding to 2 decimal places using Math.round
            performance[i][0] = total;
            performance[i][1] = Math.round(avg * 100.0) / 100.0;
            performance[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return performance;
    }

    public static void main(String[] args) {
        // Sample PCM scores (Physics, Chemistry, Maths) for 3 students
        int[][] studentMarks = {
            {85, 90, 78},
            {92, 88, 95},
            {70, 65, 80}
        };

        double[][] stats = calculatePerformance(studentMarks);

        System.out.println("Student\tTotal\tAverage\tPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println((i + 1) + "\t" + stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }
}