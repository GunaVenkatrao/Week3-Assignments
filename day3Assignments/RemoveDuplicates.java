package week3.day3Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * 	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

		String text = "We learn java basics as part of java sessions in java week1";		
		int count=0;
		String[] split = text.split(" ");
		List<String> str=new ArrayList<String>(Arrays.asList(split));
		/*for (int i = 0; i < split.length-1; i++) {
			str.add(split[i]);
		}*/

		System.out.println(str);
		
		
		
		for (int i = 0; i < str.size()-1; i++) {
			count=0;
			for (int j = 0; j < str.size()-1; j++)
			{
				if (str.get(i).equals(str.get(j)))
				{
					count=count+1;
					
				}
				
				
			}
if(count>1)
			{
				str.removeAll(Collections.singleton(str.get(i)));	
			
			}
			
			
		}
		
		System.out.println(str);

	
	}
}