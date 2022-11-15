package homework;
import java.util.Scanner;
public class Bankdisplay extends Banktransaction {
static int total;
static int withdraw;
static int deposit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Bankdisplay bankdisplay=new Bankdisplay();
System.out.println("Available transaction");
System.out.println("a.Withdrawal amount");
System.out.println("b.Deposit amount");
System.out.println("c.Total balance available");
System.out.println("Select y6our transaction :");
String str=sc.nextLine();
switch(str)
{
case "a":
	System.out.println("Enter the total amount :");
	total=sc.nextInt();
	System.out.println("Enter the withdrawal amount :");
	withdraw=sc.nextInt();
	bankdisplay.withdrawal(total,withdraw);
	break;
case "b":
	System.out.println("Enter the total amount :");
	total=sc.nextInt();
	System.out.println("Enter the deposit amount :");
	deposit=sc.nextInt();
	bankdisplay.deposit(total, deposit);
	break;
case "c":
	System.out.println("Enter the total amount :");
	total=sc.nextInt();
	bankdisplay.total(total);
	break;
	default:
		System.out.println("Select correct option from above");
}
}

}
