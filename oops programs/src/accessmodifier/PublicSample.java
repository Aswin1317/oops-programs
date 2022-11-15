package accessmodifier;

public class PublicSample {
public int a=10;
private int b=15;
protected int c=20;
int d=25;
public void display()
{
	System.out.println("Public variable "+a);
	System.out.println("Private variable "+b);
	System.out.println("Protected variable "+c);
	System.out.println("Default variable "+d);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PublicSample publicsample=new PublicSample();

	}

}
