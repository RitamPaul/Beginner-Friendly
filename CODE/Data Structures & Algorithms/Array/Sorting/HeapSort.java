// Heap Sort Algorithm:

// First convert the array into heap data structure using heapify, then one by one delete the root node of the Max-heap and replace it with the last node in the heap and then heapify the root of the heap. 
// Repeat this process until size of heap is greater than 1.
// Build a heap from the given input array.
// Repeat the following steps until the heap contains only one element:
// Swap the root element of the heap (which is the largest element) with the last element of the heap.
// Remove the last element of the heap (which is now in the correct position).
// Heapify the remaining elements of the heap.
// The sorted array is obtained by reversing the order of the elements in the input array.

public class HeapSort  
{  
static void heapify(int a[], int n, int i)  
{  
    int largest = i; // Initialize largest as root  
    int left = 2 * i + 1; // left child  
    int right = 2 * i + 2; // right child  
    // If left child is larger than root  
    if (left < n && a[left] > a[largest])  
        largest = left;  
    // If right child is larger than root  
    if (right < n && a[right] > a[largest])  
        largest = right;  
    // If root is not largest  
    if (largest != i) {  
        // swap a[i] with a[largest]  
        int temp = a[i];  
        a[i] = a[largest];  
        a[largest] = temp;  
          
        heapify(a, n, largest);  
    }  
}  
/*Function to implement the heap sort*/  
static void heapSort(int a[], int n)  
{  
    for (int i = n / 2 - 1; i >= 0; i--)  
        heapify(a, n, i);  
  
    // One by one extract an element from heap  
    for (int i = n - 1; i >= 0; i--) {  
        /* Move current root element to end*/  
        // swap a[0] with a[i]  
        int temp = a[0];  
        a[0] = a[i];  
        a[i] = temp;  
          
        heapify(a, i, 0);  
    }  
}  
/* function to print the array elements */  
static void printArr(int a[], int n)  
{  
    for (int i = 0; i < n; ++i)  
        System.out.print(a[i] + " ");  
}  
public static void main(String args[])   
{  
    int a[] = {5, 17, 20, 14, 25, 23, -21, -10};  
    int n = a.length;  
    System.out.print("Given array elements are - \n");  
    printArr(a, n);  
    heapSort(a, n);  
    System.out.print("\nSorted array elements are - \n");  
    printArr(a, n);  
}  
}  
