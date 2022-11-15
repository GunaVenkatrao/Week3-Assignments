package week3.day3Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr= {5,2,3,1,7,6,8};
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
			
		}
		System.out.println(lst);
		Collections.sort(lst);
		for(int i=0;i<lst.size()-1 ;i++)
		{
			if(i+1!=lst.get(i))
			{
				System.out.println(i+1);
				break;
			}
		}


	}

}
