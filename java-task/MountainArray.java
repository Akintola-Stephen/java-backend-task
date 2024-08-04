/**
 * This class contains a method to check if a given array represents a valid
 * mountain array.
 */
public class MountainArray {

    /**
     * Checks if the given array represents a valid mountain array.
     * A mountain array must satisfy the following conditions:
     * 1. It has at least 3 elements.
     * 2. It has exactly one peak element which is not the first or the last
     * element.
     * 3. Elements strictly increase before the peak and strictly decrease after the
     * peak.
     *
     * @param arr The input array to be checked.
     * @return True if the input array represents a valid mountain array, false
     *         otherwise.
     */
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;

        // A valid mountain array must have at least 3 elements
        if (n < 3) {
            return false;
        }
        
        int i = 0;

        // Walk up the mountain: strictly increasing part
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak element must not be the first or the last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Walk down the mountain: strictly decreasing part
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // If we've reached the end of the array, it's a valid mountain array
        return i == n - 1;
    }

    public static void main(String[] args) {
        // Test cases to validate the functionality of the validMountainArray method
        System.out.println(validMountainArray(new int[] { 2, 1 })); // Output: false
        System.out.println(validMountainArray(new int[] { 3, 5, 5 })); // Output: false
        System.out.println(validMountainArray(new int[] { 0, 3, 2, 1 })); // Output: true
    }
}
