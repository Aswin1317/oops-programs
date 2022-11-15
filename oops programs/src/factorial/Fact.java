package factorial;

public class Fact {
	int fact;
public void display(int a)
{
	fact=1;
	for(int i=1;i<=5;i++)
	{
	fact=fact*i;
	}
	sum();
}
public void sum()
{
	System.out.println("Factorial is "+fact);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fact fact=new Fact();
fact.display(5);
	}

}
