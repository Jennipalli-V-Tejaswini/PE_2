import java.util.Scanner;

public class EvenNumTest {
	public static void main(String[] args) {
		int number;
        Scanner s = new Scanner(System.in);
		
		System.out.println("Enter input");
		number= s.nextInt();
		
		if (isEven(number)==true){
			System.out.println("returned true");   
		}
		else {
			System.out.println("returned false");   //do task
		}
	}

	
	public static boolean isEven(int number) {
if (number%2==0)
	return true;
else
	return false;
}

}