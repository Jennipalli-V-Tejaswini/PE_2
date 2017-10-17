import java.util.Scanner;

public class JE_2 {

		public static void compute(int num)
		{
			int quotient,k;
		do {
			quotient=(num/4);
			k=num%4;
			if(k!=0)
				break;
			num=quotient;
		}
		while(quotient>1);
			if((quotient==1)&&(k==0))
				System.out.println("Its a power of 4");
			else
				System.out.println("No");
				
	}
		public static void main(String[] args) {
			int number;
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter number");
			number = s.nextInt();
	        compute(number);
}
}
