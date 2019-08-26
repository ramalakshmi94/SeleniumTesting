package week8;

public class PrintStar 
{
	public static void main(String[] args) 
	{
		int starnum=7,space=0;
		while(starnum>0)
		{
			PrintStar ps= new PrintStar();
			ps.printSpace(space);
			ps.printStar(starnum);
			ps.printSpace(space);
			System.out.println("\n");
			starnum-=2;
			space=space+1;
		}
	}
	public void printStar(int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.print("*");
		}
	}
	public void printSpace(int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.print(" ");
		}
	}
}
