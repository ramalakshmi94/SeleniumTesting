package package1;
 
public class DefaultClassOne 
{ 
	static protected int g=1;
 // Here I didnt mention any modifier so it acts as a default modifier. 
	public int publicMethod(int x)
	{
		
		return x;
	}
	private int privateMethod(int y)
	{
		return y;
	} 
	protected int protectedMethod(int x)
	{
		
		return x;
	}
	int defaultMethod(int x)
	{
		return x;
	}
public static int a=10; 
private static int b=30;
protected static int c=40;
static int d=40;
 
 public static void main(String[] args) {
	DefaultClassOne d= new DefaultClassOne();
	//access within the class
	d.publicMethod(5);
	d.privateMethod(5);
	d.protectedMethod(25);
	d.defaultMethod(35);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(g);
	
}
}