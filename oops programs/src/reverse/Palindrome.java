package reverse;
import java.util.Scanner;
public class Palindrome {
	int rem;
	int rev;
	int n;
Palindrome()
{
System.out.println("Finding the Palindrome");
}
Palindrome(int a)
{
	this();
	n=a;
	rev=0;
	while(n>0)
	{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
	//System.out.print("Reverse of "+n +"is"+rev);
	if(rev==a)
	{
		System.out.println("The number is Palindrome" +a);
		}
		else
		{
		System.out.println("The number "+a+" is not a Palindrome");
		}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number :");
int n=sc.nextInt();
Palindrome palindrome=new Palindrome(n);

	}

}
