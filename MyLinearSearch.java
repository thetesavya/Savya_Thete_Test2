package com.Savya;

public class MyLinearSearch {
	public static void main(String[] args)
	{
      int[] arr = {33, 8, 71, 19, 56, 44, 27};
      int target = 56;
      int i;
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Checking index "+i+" value "+arr[i]);
		
			if(arr[i] == target)
			{
				System.out.println("56 found at index :"+(i+1));
				System.out.println("Total Steps taken: "+(i+1));
				break;
			}
			else
				continue;
		}
	}

}
