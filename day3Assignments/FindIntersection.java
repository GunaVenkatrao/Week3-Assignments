package week3.day3Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
			
			int[] arr1= {3,2,11,4,6,7};
			int[] arr2= {1,2,8,4,9,7,3,11,8};
			List<Integer> lst1=new ArrayList<Integer>();
			List<Integer> lst2=new ArrayList<Integer>();
			for(int i=0;i<arr1.length-1;i++)
			{
				lst1.add(arr1[i]);
			}
			for(int i=0;i<arr2.length-1;i++)
			{
				lst2.add(arr2[i]);
			}
			
			
			System.out.println(lst1);
			System.out.println(lst2);
			
			System.out.println("The common numbers in the both list are ");
				
			for(int i=0;i<lst1.size();i++)
			{
				for(int j=0;j<lst2.size();j++)
				{
					if(lst1.get(i)==lst2.get(j))
					{
					System.out.println(lst1.get(i));
					}
				}
			}
					


	}

}
