package selftrials;
import java.util.Scanner;

public class String1
{
	static {
		System.out.println("static"); 
		
	}
    public static void main(String args[]){
        int a;
        String s;
        Scanner scan =new Scanner(System.in);

        System.out.println("enter a no");
        a = scan.nextInt();
        System.out.println(a);
      //  scan.nextLine();

        System.out.println("\nenter a string");
        s = scan.nextLine();
        System.out.println("string is="+s);
        scan.close();
    }
}