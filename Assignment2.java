import java.util.Scanner;

public class Assignment2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input a word or phrase");
		String original = scan.nextLine();
		System.out.println("Please input the string you would like to search for in your word or phrase");
		String search = scan.nextLine();
		
		System.out.println("Do you want to consider spaces? Type 1 for Yes, or 0 for No");
		String spaces = scan.nextLine();
		System.out.println("Do you want to consider uppercase and lowercase as different? Type 1 for Yes, or 0 for No");
		String upper = scan.nextLine();
		
		int spaces1 = Integer.parseInt(spaces);
		int upper1 = Integer.parseInt(upper);
		
		if(spaces1 == 0)
		{
			for(int i = 0; i<original.length(); i++)
			{
				original = original.replace(" ", "");
			}
			for(int i = 0; i<search.length(); i++)
			{
				search = search.replace(" ", "");
			}
		}
		if(upper1 == 0)
		{
			for(int i = 0; i<original.length(); i++)
			{
				original = original.toLowerCase();
			}
			for(int i = 0; i<search.length(); i++)
			{
				search = search.toLowerCase();
			}
		}
		
		String ans = "Your search was not found in the input";
		
		if(search.equals(original))
		{
			ans = "Your search is equal to the entire string";
		}
		else
		{
			if(original.contains(search))
				{
					if(original.indexOf(search)==0)
					{
						ans="Your search is at the beginning of the input";
					}
					else if(search.substring(search.length()-1, search.length()).equals(original.substring(original.length()-1, original.length())))
					{
						ans="Your search is at the end of the input";
					}
					else
					{
						ans = "Your search starts at index " + original.indexOf(search) + " and ends at index " + original.indexOf(search.substring(search.length()-1, search.length()));
					}
			}
		}
		System.out.println(ans);
	}
}
