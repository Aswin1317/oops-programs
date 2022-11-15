package studentmark;
import java.util.Scanner;
public class Address {
	String c;
public void sum()
{
	Scanner scc=new Scanner(System.in);
	System.out.print("Enter the Address = ");
	c=scc.nextLine();
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student=new Student();
student.name();
Address address=new Address();
address.sum();
System.out.println("Name = " +student.a);
System.out.println("Roll No = "+student.b);
System.out.println("Address = "+address.c);
	}

}
