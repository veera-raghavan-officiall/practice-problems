import java.util.Scanner;

public class FactorsUtility {
    // Static method to find factors and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double calculateSumOfSquares(int[] factors) {
        double sumSq = 0;
        for (int f : factors) sumSq += Math.pow(f, 2);
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int[] factorsArray = findFactors(num);
        System.out.println("Sum: " + calculateSum(factorsArray));
        System.out.println("Product: " + calculateProduct(factorsArray));
        System.out.println("Sum of Squares: " + calculateSumOfSquares(factorsArray));
    }
}