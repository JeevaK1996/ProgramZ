package ex2;

import java.util.Scanner;

public class BMI {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	float weight=scanner.nextInt();
	float height=scanner.nextInt();
	float bmi=((weight)*703)/(height*height);
	if(bmi<18.5){
		System.out.println("underlevel");
	}else if(bmi>18.5&&bmi<24.9){
		System.out.println("normal");
	}else if(bmi>25&&bmi<29.9){
		System.out.println("over weight");
	}else if(bmi>30){
		System.out.println("obese");
	}
	scanner.close();
}
}
