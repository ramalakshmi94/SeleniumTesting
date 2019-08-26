package week1.day1;

public class PrintStar 
{
	public static void main(String[] args) 
	{
		int starnum=7,space=0;
		while(starnum>0)
		{
			PrintStar ps= new PrintStar();
			ps.printSpace(space);
			ps.printStar(space);
			ps.printSpace(space);
			starnum-=2;
			space++;
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
