package arrays;

public class Foreach {
public static void main(String[] args) {
	int a[]={3,4,5,6,2,56,8,4};
	int max=a[0];
	for(int b:a){
		System.out.println(b);
		if(max<b){
			max=b;
			System.out.println(max);
		}
	}
System.out.println("max:"+max);
}
}
