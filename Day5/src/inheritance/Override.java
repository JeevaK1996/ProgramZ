package inheritance;
class Super{
	int n=10;
	public void display(){
		System.out.println("Display method of super class");
	}
}
public class Override extends Super{
	int n=20;
	public void diplay(){
		System.out.println("Display of Subclass");
	}
	public void invoke(){
		Override override=new Override();
		override.diplay();
		super.display();
		System.out.println("num from super class: "+override.n);
		System.out.println("num from sub class: "+super.n);
	}
	public static void main(String[] args) {
		Override  override=new Override();
		override.invoke();
		
	}
}
