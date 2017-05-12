package inheritance;
class Sup{
	int age;
	public Sup(int age) {
this.age=age;
	}
	public void getAge(){
		System.out.println("Age from super class const:"+age);
	}
}
public class Const extends Sup{

	public Const(int age) {
		super(age);

	}
public static void main(String[] args) {
	Const const1=new Const(34);
	const1.getAge();
}
}
