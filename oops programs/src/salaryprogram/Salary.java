package salaryprogram;
import java.util.Scanner;
public class Salary {
int basicpay;
int deduction;
int bonus;
public void salary()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Basic Pay :");
	basicpay=sc.nextInt();
	System.out.println("Enter Deduction Amount :");
	deduction=sc.nextInt();
	System.out.println("Enter Bonus Amount :");
	bonus=sc.nextInt();
}
}
