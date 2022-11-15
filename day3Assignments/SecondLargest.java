package week3.day3Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// // Here is the input
		int[] data = {3,2,11,4,6,7};
		List<Integer> lst = new ArrayList<Integer>();
		for(int i=0;i<data.length;i++)
		{
			lst.add(data[i]);
		}
		Collections.sort(lst);
		int size = lst.size();
		System.out.println(lst);
		
		System.out.println("The second largest number from  the list "+lst+ " is "+lst.get(size-2));

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		

	}

}
