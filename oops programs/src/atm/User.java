package atm;
import java.util.Scanner;
public class User extends Bank  {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	User user=new User();
	System.out.println("Enter the pin :");
	int pin=sc.nextInt();
	user.display(pin);
}
}
