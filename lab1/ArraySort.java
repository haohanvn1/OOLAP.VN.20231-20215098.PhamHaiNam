import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        Arrays.sort(numbers);

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);

        scanner.close();
    }
}
