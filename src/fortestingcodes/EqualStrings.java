package fortestingcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EqualStrings {

	public static int countDigit(String s1)
	{
		int count = 0;
		//String str1 = "0123456789";
		for(int i = 0; i < s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(c >= '0' && c <= '9'){
				count++;
			}
		}
		return count;
		
	}
	
	public String toString()
	{
		return null;
	}
	
	public static int myCompareTo(String s1, String s2)
	{
		int compare= 0;
		for(int i = 0; i < s1.length() && i < s2.length(); i++ )
		{
		char c1 = s1.charAt(i);
		char c2 = s2.charAt(i);
		
		if(c1 < c2) 
		{
			compare = -1;
		}
		else if(c1 > c2)
		{
			compare = 1;
		}
				
	}
		return compare;
}

	
		
	public static void main(String[] args)
	{
		int[] arr = {1,2,3};
		
		ArrayList arrl = new ArrayList();
		List arraylist = new ArrayList();
		arraylist =	Arrays.asList(arr);
		
		for(int i = 0; i < arr.length; i++)
		{
			arrl.add(arr[i]);
		}
		System.out.println("Array List"+ arraylist.toString());
		System.out.println("Digit : "+ countDigit("09hye6784"));
		System.out.println("Compare:"+ myCompareTo("hihihi", "hello"));
		
	}
}
