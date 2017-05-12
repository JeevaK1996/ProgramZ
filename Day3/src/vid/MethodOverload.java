package vid;
public class MethodOverload {
	public MethodOverload() {
		System.out.println("no args cons");
	}
	public MethodOverload(float one){
		this();
		System.out.println("one cons");
	}
	public MethodOverload(float two,float one){
		//this(one);
		System.out.println("two cons");
	}
	public void display(){
		System.out.println("no args");
	}
	public int display(int a){
			System.out.println("display part");
		return a*a;
	
	}
	public int display(int a,int b){
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverload methodOverload=new MethodOverload();
		@SuppressWarnings("unused")
		MethodOverload overload=new MethodOverload();
		@SuppressWarnings("unused")
		MethodOverload overload2=new MethodOverload(0);
		@SuppressWarnings("unused")
		MethodOverload overload3=new MethodOverload(0, 0);
		methodOverload.display();
		System.out.println(methodOverload.display(5));
		System.out.println(methodOverload.display(5, 7));
		
	}
}
