package atm;
import java.util.Scanner;
public class User1 {
	int total;
	int withdraw;
	int deposit;
	public void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Renter your correct pin :");
		int d=sc.nextInt();
		this.validate(d);
	}
public void validate(int pin)
{
Scanner sc=new Scanner(System.in);
	Bank1 bank=new Bank1();
			if((bank.getA()==pin) || (bank.getB()==pin) || (bank.getC()==pin))
			{
				System.out.println("Pin is correct");
				System.out.println("Available transaction");
				System.out.println("a.Withdraw amount");
				System.out.println("b.deposit amount");
				System.out.print("Select your transaction :");
				String cr=sc.nextLine();
				switch(cr)
				{
				case "a":
					System.out.print("Enter the total amount :");
					total=sc.nextInt();
					System.out.print("Enter the withdrawal amount :");
					withdraw=sc.nextInt();
					int b=total-withdraw;
					System.out.print("Amount after withdrawal is "+b);
					break;
				case "b":
					System.out.print("Enter the total amount :");
					total=sc.nextInt();
					System.out.print("Enter the deposit amount :");
					deposit=sc.nextInt();
					int c=total+deposit;
					System.out.print("Amount after deposit is :"+c);
					break;
				}
			}
			else
			{
				System.out.println("Incorrect pin");
				this.sum();
				
			}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.print("Enter the pin :");
int pin=sc.nextInt();
User1 user=new User1();
user.validate(pin);
	}

}
