package demos.week1; 

//import java.awt.Rectangle; // You can * to include all of the libraries

public class StringDemo 
{
	public static void main(String[] args)
	{
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println("String length is: " + len);
		
		System.out.println(palindrome.replace(' ', 'X'));
		
		System.out.println(palindrome.toLowerCase());
		System.out.println(palindrome.toUpperCase());
		
		System.out.println(palindrome.substring(2));
		System.out.println(palindrome.substring(4, 7));
		
	}
}
