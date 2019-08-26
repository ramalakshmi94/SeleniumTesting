package package1;
import package1.DefaultClassOne;
 
public class DefaultClassTwo
{
 public static void main(String args[]) 
 {
 // Created an object of ClassOne
 DefaultClassOne d = new DefaultClassOne();
 // Trying to access the default method of ClassOne which is in packageOne
 // You can find an error at obj.myMethod
 DefaultClassTwo d2 = new DefaultClassTwo();
 //within the package but different class
	d.publicMethod(5);
	/*d.privateMethod(5);*/
	d.protectedMethod(25);
	d.defaultMethod(35);
	System.out.println(d.a);
	/*System.out.println(d.b);*/
	System.out.println(d.c);
	System.out.println(d.d);
	System.out.println(d.g);
 }
}