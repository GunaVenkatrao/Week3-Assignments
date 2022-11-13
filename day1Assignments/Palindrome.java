package week3.day1Assignments;

public class Palindrome {

	public static void main(String[] args) {
		String test="madam";
		String revtest="";
		char[] charArray = test.toCharArray();
		for (int i = charArray.length-1; i >=0; i--)
		{
			
			//char a=charArray[i];
			revtest=revtest+charArray[i];
		}
		
		if(test.equalsIgnoreCase(revtest))
		{
			System.out.println("The given string "+test+ " Palindrome");
			
		}
		else
		{
			System.out.println("The given string "+test+ " not a Palindrome");
			
		}
		}


	}

