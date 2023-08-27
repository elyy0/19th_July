//Write a program to accept a number from user and check if it is Armstrong number or not.

package Functions;
import java.util.*;
public class Armstrong_demo {

	public static void main(String[] args) {
		int number,originalNumber,remainder,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		number=sc.nextInt();
		originalNumber=number;
		while(originalNumber!=0)
		{
			remainder=originalNumber%10;
			result+=Math.pow(remainder,3);
			originalNumber=originalNumber/10;
		}
		if(result==number)
		{
			System.out.println(number+ " is an Armstrong number.");
		}       
		else
		{
			System.out.println(number+ " is not an Armstrong number.");
		}
	}

}
