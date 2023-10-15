// Algorithm for Insertion Sort: 
// Step 1 - If the element is the first element, assume that it is already sorted. Return 1.
// Step 2 - Pick the next element, and store it separately in a key.
// Step 3 - Now, compare the key with all elements in the sorted array.
// Step 4 - If the element in the sorted array is smaller than the current element, then move to the next element. Else, shift greater elements in the array towards the right.
// Step 5 - Insert the value.
// Step 6 - Repeat until the array is sorted.



public class InsertionSort  
{  
    void insert(int a[]) /* function to sort an aay with insertion sort */  
{  
    int i, j, temp;  
    int n = a.length;  
    for (i = 1; i < n; i++) {  
        temp = a[i];  
        j = i - 1;  
  
        while(j>=0 && temp <= a[j])  /* Move the elements greater than temp to one position ahead from their current position*/  
        {    
            a[j+1] = a[j];     
            j = j-1;    
        }    
        a[j+1] = temp;    
    }  
}  
void printArr(int a[]) /* function to print the array */  
{  
    int i;  
    int n = a.length;  
    for (i = 0; i < n; i++)  
    System.out.print(a[i] + " ");  
}  
  
    public static void main(String[] args) {  
    int a[] = { 92, 50, 5, 20, 11, 22 };  
    Insert i1 = new Insert();  
    System.out.println("\nUnsorted array elements are - ");  
    i1.printArr(a);  
    i1.insert(a);  
    System.out.println("\n\nSorted array elements are - ");  
    i1.printArr(a);  
    System.out.println();  
    }  
}  
