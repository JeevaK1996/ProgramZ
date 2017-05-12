package ex3;

public class Cons {
	public Cons() 

	{
		System.out.println("no args cons");		
	}
	public Cons(int a){
		this();
		System.out.println("one args cons");
	}
	public Cons(int c, String b){
		this(c);
		System.out.println("two args cons");
	}
	public void play(){
		System.out.println("just an method");
	}
	public static void main(String[] args) {
		Cons cons=new Cons(3, "hi");
		cons.play();
	}
}
