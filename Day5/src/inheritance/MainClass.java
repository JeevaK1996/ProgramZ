package inheritance;
class A
{
	int i = 10;
}

class B extends A
{
	int i = 20;
}

public class MainClass
{
	public static void main(String[] args)
	{
		A a = new B();
		B b=new B();
		System.out.println(a.i+" "+b.i);
	}
}