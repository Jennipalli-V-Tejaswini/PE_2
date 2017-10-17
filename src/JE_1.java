
import java.util.Scanner;

public class JE_1 {
	
		public static void reverseString(String x)
		{
			int i,count=0;
		String[] strArray = x.split("");
		int n=strArray.length;
		String[] reverse=new String[n];
		for(i=0;i<n;i++) {
			reverse[i]=strArray[n-1-i];
		}
		
		for(i=0;i<(n/2);i++) {
			if(strArray[i].charAt(0)==reverse[i].charAt(0)){
				count=1;
			}
				
			else {
				count=0;
				break;
			}
		}
		if(count==1) {
			System.out.print(x);
			System.out.print(" is a palindrome\t");
		}
		else {
			System.out.print(x);
			System.out.print("is not a palindrome\t");
			
		}
	}
		public static void main(String[] args) {

			String input;

			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter input");
			input= s.nextLine();
			reverseString(input);
	}		
		
}
