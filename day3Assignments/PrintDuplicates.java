package week3.day3Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		// declare an int variable named count
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		
			// assign 0 to count 
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			
					// compare both the loop variables & check they're equal
				
							// print the matching value
		
int count=0;
List<Integer> lst=new ArrayList<Integer>();
for (int i = 0; i < arr.length; i++) {
	lst.add(arr[i]);
}
Collections.sort(lst);
System.out.println(lst);

System.out.println("The Duplicates from the list are ");
for (int i = 0; i < lst.size()-1; i++) {
	count=0;
	for(int j=0;j<lst.size();j++)
	{
	if(lst.get(i)==lst.get(j))
	{
		count=count+1;
	}
}
if(count>1)
{
	System.out.println(lst.get(i));

}

	}

}
}
