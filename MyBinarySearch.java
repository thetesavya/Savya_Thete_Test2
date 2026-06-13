package com.Savya;

public class MyBinarySearch {
	public static void main(String[] args) {

        int[] array = {9, 21, 34, 48, 57, 66, 83};
        int target = 66	;

        int left = 0;
        int right = array.length - 1;
        int result = -1	;
        int c=0;
        int mid=0;

        while (left <= right) {

            mid = (left + right) / 2;

            System.out.println("Left=" + left +
                               " Right=" + right +
                               " Mid=" + mid +
                               " Value=" + array[mid]);

            if (array[mid] == target) {
                result=array[mid];
                c++;
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            c++;
        }

        if(result != -1) {
            System.out.println("Found at: " + mid);
        } else {
            System.out.println("Not Found!");
        }
        System.out.println("Total Steps: "+c);
        
                               
        
	}

}
