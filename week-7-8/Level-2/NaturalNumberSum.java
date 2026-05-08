import java.util.Scanner;

public class NaturalNumberSum {
    // Recursive method to find sum
    public int findSumRecursion(int n) {
        if (n <= 1) return n;
        return n + findSumRecursion(n - 1);
    }

    // Formula based method[cite: 2]
    public int findSumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NaturalNumberSum app = new NaturalNumberSum();

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int recursiveResult = app.findSumRecursion(n);
            int formulaResult = app.findSumFormula(n);
            
            System.out.println("Recursion Result: " + recursiveResult);
            System.out.println("Formula Result: " + formulaResult);
            System.out.println("Are results identical? " + (recursiveResult == formulaResult));
        } else {
            System.out.println("Not a natural number.");
        }
    }
}