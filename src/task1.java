/**
* Function to find the minimum element in an array
* Check if the array is empty
* If the array is empty, return the minimum integer value
* indicating that no minimum value exists
* Iterate through the array starting from the second element
* If the current element is smaller than the current minimum,
* update the minimum element to the current element
* Return the minimum element found
 */
import java.util.Scanner;
public class MinimumElement {
    public static int Minimum(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minimum = Minimum(arr);
        System.out.println(minimum);
        scanner.close();
    }
}