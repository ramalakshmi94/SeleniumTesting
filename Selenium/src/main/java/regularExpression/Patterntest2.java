package regularExpression;

import java.util.regex.Pattern;

public class Patterntest2 
{
public static void main(String[] args) {
	String text="This is the text to be searched";
	String regex=".*"+"is"+".*";
	regex=".*is.*";
	regex=".*[is]{2}.*";
	boolean matches = Pattern.matches(regex, text);
	System.out.println(matches);
	
	
/*	String text    =
	        "This is the text to be searched " +
	        "for occurrences of the http:// pattern.";

	String regex = ".*http://.*";

	boolean matches = Pattern.matches(regex, text);

	System.out.println("matches = " + matches);
*/}	
}
