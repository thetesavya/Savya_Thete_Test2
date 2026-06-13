package com.Savya;

public class MySelectionSort {
    public static void main(String[] args) {
        int arr[] = {52, 18, 37, 9, 64};
        int swaps = 0;

        System.out.print("Before Sorting: ");
        for(int num=0;num<arr.length;num++)
        {
        	System.out.print(arr[num]+" ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("\n--- Pass " + (i + 1) + " ---");

            int minIndex = i;

            System.out.println("Assumed minimum: " +
                    arr[minIndex] + " at index " + minIndex);

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println("New minimum found: " +
                            arr[minIndex] + " at index " + minIndex);
                }
            }
            if (minIndex!= i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;

                System.out.println("Swapped: " +
                        arr[i] + " to index " + i);
            }
            System.out.print("Array after Pass " + (i + 1) + ": ");
            for(int num=0;num<arr.length;num++)
            {
            	System.out.print(arr[num]+" ");
            }
        }

        System.out.println("\nTotal Swaps: " + swaps);
        System.out.print("After Sorting: ");
        
        for(int num=0;num<arr.length;num++)
        {
        	System.out.print(arr[num]+" ");
        }
    }
}
