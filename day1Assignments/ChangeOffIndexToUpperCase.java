package week3.day1Assignments;

public class ChangeOffIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		String upper="";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++)
		{
			char a=charArray[i];
			if(i%2==1)
			{

				upper=upper+Character.toUpperCase(a);
			}
			else
			{
				 upper=upper+charArray[i];
			}
		}
		System.out.println(upper);
	}

}
