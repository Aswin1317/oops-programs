package homework;

public class Divisable extends AddDivisible {
	
public void name()
{
	int d=super.sum();
	if(d%10==0)
	{
		System.out.println("It is divisable");
	}
	else
	{
		System.out.println("It is not divisible");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Divisable divisable=new Divisable();
divisable.name();

	}

}
