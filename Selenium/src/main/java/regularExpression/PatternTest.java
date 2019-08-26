package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest 
{
public static void main(String[] args) 
{
	Pattern p;
	Matcher match;
	boolean ismatches;
	String singleAlphabetPattern= "[abc]";
	p = Pattern.compile(singleAlphabetPattern);
	String singleAlphabet="a"; //true bcs one character and within the pattern [abc]
	match=p.matcher(singleAlphabet);
	ismatches = match.matches();
	System.out.println(ismatches);
	singleAlphabet="ab"; //false - more than one char is present, eventhough within pattern [abc]
	match=p.matcher(singleAlphabet);
	ismatches = match.matches();
	System.out.println(ismatches);
	String AlphaNotInPattern="d"; //false - bcs not within the pattern [abc]
	match=p.matcher(singleAlphabet);
	ismatches = match.matches();
	System.out.println(ismatches);

	
	String MultiAphabetPattern="[abc]+";
	String MultiAlphabet="aa"; // true- bcs within the pattern and present atleast one time
	p = Pattern.compile(MultiAphabetPattern);
	match=p.matcher(MultiAlphabet);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	String SingleAlpha="a"; // true- bcs within the pattern and present atleast one time
	match=p.matcher(SingleAlpha);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	String MultiAlphaNotWithinPattern="aabccd"; // false- bcs 'd' not within the pattern
	match=p.matcher(MultiAlphaNotWithinPattern);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	String Number="1"; // false- bcs atleast one char not within the pattern
	match=p.matcher(Number);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	String NullString=""; // false- bcs atleast one char not within the pattern
	match=p.matcher(NullString);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	
	String ZeroCharPattern="[abc]*";
	String ZeroChar=""; // true- zero or more char matching pattern
	p = Pattern.compile(ZeroCharPattern);
	match=p.matcher(ZeroChar);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	String outOfPattern="d"; // false- bcs char not within pattern
	match=p.matcher(outOfPattern);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	String DotPattern=".";
	String Dot="a"; // true- one char present and any char can be matched
	p = Pattern.compile(DotPattern);
	match=p.matcher(Dot);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	DotPattern=".";
	Dot="ab"; // false - any char can be matched but more than one char present
	p = Pattern.compile(DotPattern);
	match=p.matcher(Dot);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	DotPattern="..";
	Dot="ab"; // true- two char present matching two dots and any char can be matched
	p = Pattern.compile(DotPattern);
	match=p.matcher(Dot);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	DotPattern=".+";
	Dot=""; // false- atleast one char not present
	p = Pattern.compile(DotPattern);
	match=p.matcher(Dot);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	DotPattern=".+";
	Dot="ab"; // true - atleast one char, any char can be matched
	p = Pattern.compile(DotPattern);
	match=p.matcher(Dot);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	DotPattern=".*";
	Dot=""; // true- zero or more char
	p = Pattern.compile(DotPattern);
	match=p.matcher(Dot);
	ismatches = match.matches();
	System.out.println(ismatches);
	
	DotPattern=".*";
	Dot="a1b"; // true - atleast one char, any char can be matched
	p = Pattern.compile(DotPattern);
	match=p.matcher(Dot);
	ismatches = match.matches();
	System.out.println(ismatches);
	
}
}

