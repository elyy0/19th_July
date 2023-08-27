//Write a program to accept a number from the user and check if it is Palindrome number or not.

package Functions;
import java.util.*;
public class Palindrom_demo {

	int num,i,rev=0,r,temp;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		Palindrom_demo obj=new Palindrom_demo();
		obj.rev();
	}
	public void rev()
	{
		System.out.println("Enter your number: ");
		num=sc.nextInt();
		System.out.println("The Number is: "+num);
		temp=num;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}			
		System.out.println("The reverse number is: "+rev);
		if(temp==rev) 
		{
			System.out.println("Number is Palindrome.");
		}
		else 
		{
			System.out.println("Number is not Palindrome.");
		}
	}
}
