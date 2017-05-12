package ex2;

import java.util.Scanner;

public class WorldPopulation {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	double previous=scanner.nextInt();
	double current=scanner.nextInt();
	double avg=current-previous;
	System.out.println("next three years");
	double a1=current+avg;
	double b1=a1+avg;
	double c1=b1+avg;
	
	System.out.println(a1+"\t"+b1+"\t"+c1);
	scanner.close();
}
}
