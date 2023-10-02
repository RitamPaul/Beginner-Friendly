public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Function to sort the array using Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Get the partition index

            // Sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array and return the partition index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the rightmost element as pivot
        int i = low - 1;  // Index of the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);  // Swap arr[i] and arr[j]
            }
        }

        swap(arr, i + 1, high);  // Swap the pivot element with the element at (i+1)
        return i + 1;  // Return the partition index
    }

    // Function to swap two elements in the array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
