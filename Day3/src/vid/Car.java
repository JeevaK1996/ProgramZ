package vid;

public class Car {
public Car() {
	System.out.println("no args car");
}
public Car(int a){
	this();
	System.out.println("super "+a);
}
public void new1(){
	System.out.println("car class");
}
}
