import java.util.Scanner;

public class Anagrams {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String s[]=new String[5];
	String s1=scanner.nextLine();
	String s2=scanner.nextLine();
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	int count=0;
	for(int i=0;i<c1.length;i++){
		for(int j=0;j<c2.length;j++){
			if(c1[i]==c2[j]){
				count++;
			}
		}
	}
	if(count==s1.length()){
		System.out.println("anagram");
	}else {
		System.out.println("not anagram");
	}
}
}
