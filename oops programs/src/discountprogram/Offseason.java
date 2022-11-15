package discountprogram;
import java.util.Scanner;
public class Offseason {
	int total;
public void discount(int total)
{
	this.total=total;
	int s=100-15;
	total=(s*total)/100;
	System.out.print("Discount is: "+total);
	
}
	
}
