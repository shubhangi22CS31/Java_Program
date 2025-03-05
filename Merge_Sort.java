//MERGE SORT 
//nlogn :time complexity

package shubhangijava;

import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to sort?");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a);
        System.out.println("Sorted array:");
        for (int x : a) {
            System.out.println(x);
        }
        sc.close();
    }

    public static void mergeSort(int[] inputArray) {
        int inputlength = inputArray.length;
        if (inputlength < 2) {
            return;
        }
        int midindex = inputlength / 2;
        int[] lefthalf = new int[midindex];
        int[] righthalf = new int[inputlength - midindex];

        // Copy elements to left half
        for (int i = 0; i < midindex; i++) {
            lefthalf[i] = inputArray[i];
        }

        // Copy elements to right half
        for (int i = midindex; i < inputlength; i++) {
            righthalf[i - midindex] = inputArray[i];
        }

        // Recursively sort the halves
        mergeSort(lefthalf);
        mergeSort(righthalf);

        // Merge the sorted halves
        merge(inputArray, lefthalf, righthalf);
    }

    private static void merge(int[] inputArray, int[] lefthalf, int[] righthalf) {
        int leftsize = lefthalf.length;
        int rightsize = righthalf.length;
        int i = 0, j = 0, k = 0;

        // Merge the two halves
        while (i < leftsize && j < rightsize) {
            if (lefthalf[i] <= righthalf[j]) {
                inputArray[k] = lefthalf[i];
                i++;
            } else {
                inputArray[k] = righthalf[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from left half if any
        while (i < leftsize) {
            inputArray[k] = lefthalf[i];
            i++;
            k++;
        }

        // Copy the remaining elements from right half if any
        while (j < rightsize) {
            inputArray[k] = righthalf[j];
            j++;
            k++;
        }
    }
}
