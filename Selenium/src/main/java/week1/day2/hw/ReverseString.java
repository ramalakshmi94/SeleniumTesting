package week1.day2.hw;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString 
{
	public static ReverseString rs = new ReverseString();
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String SentenceToReverse=scanner.nextLine();
		rs.ReverseWordsInSentence(SentenceToReverse);
		String words[]=rs.splitwords(SentenceToReverse);
		/* Logic to reverse all the words in an array
		for(String str:words)
		{
			System.out.println(rs.ReverseWord(str));	
		}*/
	}
//method to split the words in a sentence and store it in a string array
	public String[] splitwords(String sentence)
	{
		String words[]=sentence.split(" ");
		return words;
	}
	
//method to reverse the words
		public String ReverseWord(String str)
		{
			String reversedString = "";
			int len=str.length()-1; //initialisation variable for "for" loop
			for(int i=len;i>=0;i--)
			{
				reversedString+=str.charAt(i);
			}
			return reversedString;
		}
		
//method to reverse the words at even position in a sentence 
		public void ReverseWordsInSentence(String line)
		{
			String words[]=rs.splitwords(line);
			for(int j=0;j<=words.length-1;j++)
			{
				if(j%2!=0)
				{
					System.out.print(ReverseWord(words[j])+" ");
				}
				else System.out.print(words[j]+" ");
			}
		}
}

//System.out.println(Arrays.toString(at)); -->prints the contents of an array as string
//System.out.println(Arrays.asList(at)); 