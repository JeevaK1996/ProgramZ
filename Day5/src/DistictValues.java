import java.util.Scanner;
public class DistictValues {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int []a=new int[3];
	int a1[]=new int[3];
	
	for(int i=0;i<a.length;i++){
		a[i]=scanner.nextInt();
		a1[i]=scanner.nextInt();
	}
	
	for(int i=0;i<a.length;i++){
		int count=0;
		for(int j=0;j<a1.length;j++){
			if(a[i]==a[j]){
				count++;
			}
			if(count==0){
				System.out.println(a[i]);
			}
		}
		
	}
	scanner.close();
}
}
