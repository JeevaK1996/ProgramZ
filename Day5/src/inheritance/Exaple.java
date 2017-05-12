package inheritance;

class abc{
	int a=0;
	public int add(int x,int y){
		return a=x+y;
	}
	public int sub(int x,int y){
		return a=x-y;
	}
}
public class Exaple extends abc {
public int mul(int x,int y){
	return x*y;
}
public static void main(String[] args) {
	Exaple exaple=new Exaple();
	int a=exaple.add(9, 7);
	int b=exaple.sub(5, 3);
	int c=exaple.mul(3, 3);
	System.out.println("add: "+a);
	System.out.println("sub: "+b);
	System.out.println("mul: "+c);
}
}
