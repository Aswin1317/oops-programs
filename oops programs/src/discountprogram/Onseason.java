package discountprogram;

import java.util.Scanner;

public class Onseason extends Offseason{
	int total;
	public void discount(int total)
	{
		this.total=total;
		int s=100-40;
		total=(s*total)/100;
		System.out.print("Discount is: "+total);
		
	}
	public void display()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount for first purchase =");
		int a=sc.nextInt();
		System.out.print("Enter the amount for second purchase =");
		int b=sc.nextInt();
		System.out.print("Enter the amount for third purchase =");
		int c=sc.nextInt();
		int total=a+b+c;
		System.out.println("Total amount is ="+total);
		System.out.print("Enter the season of purchase =");
		System.out.print("a.Onseason");
		System.out.print("b.Offseason");
		String ch=sc.next();
		switch(ch)
		{
		case "a":
			this.discount(total);
		break;
		case "b":
			super.discount(total);
		break;
		}
	}
	public static void main(String[] args) {
		Onseason onseason=new Onseason();
		onseason.display();
	}
}
